public class App {

    // static int cache[][] = new int[3][3];

    // =========================== MEMOIZATION METHOD ===========================
    // static int solve(int grid[][], int i, int j, int m, int n) {
    // if (i == m - 1 && j == n - 1) {
    // return grid[m - 1][n - 1];
    // }
    // if (i >= m || j >= n) {
    // return Integer.MAX_VALUE;
    // }
    // if (cache[i][j] != 0) {
    // return cache[i][j];
    // }
    // int t = 0;
    // int s = 0;
    // t = solve(grid, i, j + 1, m, n);
    // s = solve(grid, i + 1, j, m, n);
    // int diagonal = solve(grid, i + 1, j + 1, m, n);
    // int x = Math.min(t, s);
    // // if (x == -1) {
    // // cache[i][j] = Math.max(Math.max(t, s), diagonal) + grid[i][j];
    // // return cache[i][j];
    // // }
    // cache[i][j] = Math.min(Math.min(t, s), diagonal) + grid[i][j];
    // return cache[i][j];
    // }
    // ============================================================================

    // ====================== TABULATION METHOD ========================
    static int tabulation(int grid[][], int m, int n) {
        int matrix[][] = new int[m][n];
        matrix[0][0] = grid[0][0];
        for (int i = 1; i < n; i++) {
            matrix[0][i] = matrix[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < m; i++) {
            matrix[i][0] = matrix[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int up = matrix[i - 1][j];
                int left = matrix[i][j - 1];
                int diagonal = matrix[i - 1][j - 1];
                matrix[i][j] = Math.min(Math.min(up, left), diagonal) + grid[i][j];
            }
        }

        for (int i[] : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        return matrix[m - 1][n - 1];
    }
    // =================================================================

    public static void main(String[] args) throws Exception {
        int grid[][] = {
                { 1, 3, 1 },
                { 1, 5, 1 },
                { 4, 2, 1 }
        };
        int m = grid.length;
        int n = grid[0].length;
        // System.out.println(solve(grid, 0, 0, m, n));
        // for (int i[] : cache) {
        // for (int j : i) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        System.out.println(tabulation(grid, m, n));

    }
}
