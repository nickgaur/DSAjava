public class App {
    static int[][] board;

    // GAME BOARD
    App(int[][] board) {
        App.board = board;
    }

    // METHOD FOR THE CHECKING WHETHER THE POSITION TO PLACE IS CORRECT
    private boolean canIPlace(int value, int row, int col) {
        // CHECKING ROW
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == value) {
                return false;
            }
        }

        // CHECKING COLUMN
        for (int i = 0; i < board[row].length; i++) {
            if (board[i][col] == value) {
                return false;
            }
        }

        // CHECKING GRID
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }

    // METHOD FOR SOLVING THE GAME
    public boolean solveSudoku(int row, int col) {

        // EDGE CASE
        if (col == board.length) {
            row = row + 1;
            col = 0;
        }

        // TERMINATION CASE
        if (row == board.length) {
            return true;
        }

        // SMALL PROBLEM
        if (board[row][col] != 0) {
            return solveSudoku(row, col + 1);
        }
        for (int i = 1; i <= board.length; i++) {
            if (canIPlace(i, row, col)) {
                board[row][col] = i;
                boolean result = solveSudoku(row, col + 1);
                if (result) {
                    return true; // stack fall
                }

                // UNDO
                board[row][col] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // CREATING A NEW GAME
        int[][] board = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

        App obj = new App(board);

        // SOLVING THE GAME
        boolean result = obj.solveSudoku(0, 0);
        // System.out.println(result);
        // PRINTING THE SOLUTION
        for (int i = 0; i < board.length; i++) {
        System.out.print("[ ");
        for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + ", ");
        }
        System.out.print("]\n");
        }
    }
}
