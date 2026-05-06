public class TicTacToeBoard {

    public static void main(String[] args) {

        // Create a 3x3 board
        char[][] board = new char[3][3];

        // Initialize the board with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Display the board
        System.out.println("Empty Tic-Tac-Toe Board:\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
