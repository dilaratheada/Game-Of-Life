public class GameOfLife {

    // Stage 3: komşu sayımı (wrap YOK; kenar dışı sayılmaz)
    private int countAliveNeighbours(Board b, int row, int col) {
        int count = 0;
        int rows = b.getRows();
        int cols = b.getCols();

        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (dr == 0 && dc == 0) continue; // kendisi değil

                int rr = row + dr;
                int cc = col + dc;

                if (rr >= 0 && rr < rows && cc >= 0 && cc < cols) {
                    if (b.isAlive(rr, cc)) count++;
                }
            }
        }
        return count;
    }

    // Stage 3: kurallara göre yeni jenerasyon üret
    public Board nextGeneration(Board current) {
        int rows = current.getRows();
        int cols = current.getCols();
        Board next = new Board(rows, cols);

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int alive = countAliveNeighbours(current, r, c);
                boolean isAlive = current.isAlive(r, c);

                boolean willLive;
                if (isAlive) {
                    // 2-3 komşu yaşayan -> yaşar; <2 veya >3 -> ölür
                    willLive = (alive == 2 || alive == 3);
                } else {
                    // ölü hücre 3 komşu yaşayan ile doğar
                    willLive = (alive == 3);
                }

                next.setAlive(r, c, willLive);
            }
        }
        return next;
    }
}
