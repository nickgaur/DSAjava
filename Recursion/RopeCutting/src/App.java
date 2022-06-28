public class App {
    static int ropeCutting(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        } else if (n < 0) {
            return -1;
        }

        int resA = ropeCutting(n - a, a, b, c);
        int resB = ropeCutting(n - b, a, b, c);
        int resC = ropeCutting(n - c, a, b, c);
        int max = Math.max(resA, Math.max(resB, resC)) + 1;
        if (max == -1) {
            return -1;
        }
        return max;
    }

    public static void main(String[] args) throws Exception {
        int result = ropeCutting(23, 12, 9, 11);
        System.out.println(result);
    }
}
