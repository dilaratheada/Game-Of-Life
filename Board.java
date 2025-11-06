import java.util.Random;

public class Board {
    private final int rows;
    private final int cols;
    private final boolean[][] cells;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.cells = new boolean[rows][cols];
    }

    public int getRows() {
        return rows;
    }
    public int getCols() {
        return cols;
    }

    public boolean isAlive(int r, int c) {
        return cells[r][c];
    }

    public void setAlive(int r, int c, boolean alive) {
        cells[r][c] = alive;
    }

    // Rastgele başlangıç: 0.0–1.0 arası yoğunluk (ör. 0.3 => %30 canlı)
    public void randomInit(double density) {
        Random rnd = new Random();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                cells[r][c] = rnd.nextDouble() < density;
            }
        }
    }

    // Konsola çizim
    public void displayBoard() {
        StringBuilder sb = new StringBuilder(rows * (cols + 1));
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                sb.append(cells[r][c] ? '⬛' : '⬜');
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}
