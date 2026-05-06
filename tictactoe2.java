import java.util.Random;

public class TicTacToeBoard {

    static char player1Symbol;
    static char player2Symbol;
    static int currentPlayer;

    public static void main(String[] args) {
        char[][] board = new char[3][3];

        initializeBoard(board);
        performToss();   // 👈 NEW USE CASE
        printBoard(board);
    }

    // Initialize board
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // 🎲 Toss logic
    public static void performToss() {
        Random rand = new Random();
        int toss = rand.nextInt(2); // 0 or 1

        if (toss == 0) {
            currentPlayer = 1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = 2;
            player2Symbol = 'X';
            player1Symbol = 'O';
        }

        // Display result
        System.out.println("Toss Result:");
        System.out.println("Player " + currentPlayer + " starts first!");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
        System.out.println();
    }

    // Print board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
