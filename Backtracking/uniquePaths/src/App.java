import java.util.ArrayList;

public class App {
    static ArrayList<Integer> helper(int m, int n, int currRow, int currCol) {
        ArrayList<Integer> result = new ArrayList<>();
        if (currRow == m - 1 && currCol == n - 1) {
            result.add(1);
            return result;
        }

        if (currCol > n - 1 || currRow > m - 1) {
            return result;
        }

        // SMALL PROBLEM
        ArrayList<Integer> returnedList = helper(m, n, currRow, currCol + 1);
        for (int t : returnedList) {
            result.add(t + 1);
        }

        ArrayList<Integer> returnedList2 = helper(m, n, currRow + 1, currCol);
        for (int t : returnedList2) {
            result.add(t + 1);
        }
        return result;
    }

    static int uniquePaths(int m, int n) {
        ArrayList<Integer> list = helper(m, n, 0, 0);
        return list.size();
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(23, 12));
    }
}
