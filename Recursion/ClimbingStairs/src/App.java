import java.util.ArrayList;

public class App {
    static ArrayList<String> distinctWays(int n, int sum) {
        if (sum == n) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        else if (sum > n) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ArrayList<String> returnedList = distinctWays(n, sum + i);
            for (String elem : returnedList) {
                result.add(elem + i);
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = distinctWays(3, 0);
        System.out.println(list);
    }
}