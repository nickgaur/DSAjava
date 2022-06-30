public class App {
    static boolean board[][];

    App(boolean board[][]) {
        App.board = board;
    }

    static boolean canIPlaceAQueen(int currRow, int currCol) {
        // CHECKING THE ROW
        for (int i = currRow; i >= 0; i--) {
            if (board[i][currCol]) {
                return false;
            }
        }
        // CHECKING LEFT DIAGONAL
        for (int i = currRow, j = currCol; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        // CHECKING RIGHT DIAGONAL
        for (int i = currRow, j = currCol; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }

    public int countNumberOfWays(boolean board[][], int currRow) {
        int count = 0;
        if (currRow == board.length) {
            return 1;
        }

        for (int cols = 0; cols < board[currRow].length; cols++) {
            if (canIPlaceAQueen(currRow, cols)) {
                board[currRow][cols] = true;
                count += countNumberOfWays(board, currRow + 1);
                // BACKTRACKING
                board[currRow][cols] = false;
            }
        }

        return count;
    }

    public static void main(String[] args) throws Exception {
        boolean board[][] = new boolean[4][4];
        App obj = new App(board);
        System.out.println("No of Ways: " + obj.countNumberOfWays(board, 0));
    }
}
