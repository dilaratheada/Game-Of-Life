public class Main {

    // En basit ayarlar (istersen değiştir)
    private static final int ROWS = 20;
    private static final int COLS = 30;
    private static final double DENSITY = 0.25; // %30 canlı başlayacak
    private static final int GENERATIONS = 400; // toplam tur sayısı
    private static final int DELAY_MS = 200;    // her tur arası bekleme

    public static void main(String[] args) throws InterruptedException {
        // Tahtayı oluştur ve rastgele başlat
        Board board = new Board(ROWS, COLS);
        board.randomInit(DENSITY);

        GameOfLife gol = new GameOfLife(); // wrap yok, ekstra özellik yok

        for (int gen = 0; gen < GENERATIONS; gen++) {
            clearScreen();
            System.out.println("Conway's Game of Life  |  Generation: " + gen);
            board.displayBoard();

            // Bir sonraki jenerasyona geç
            board = gol.nextGeneration(board);

            Thread.sleep(DELAY_MS);
        }

        System.out.println("\nDone. (You can adjust constants in Main.java)");
    }

    // Basit ekran temizleme (çoğu terminalde çalışır; çalışmazsa sorun değil)
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
