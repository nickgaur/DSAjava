public class App {

    // MEMOIZATION METHOD
    // static int fibMemo(int n, int cache[]) {
    // if (n <= 1) {
    // return n;
    // }
    // if (cache[n] != 0) {
    // return cache[n];
    // }
    // int res = fibMemo(n - 1, cache) + fibMemo(n - 2, cache);
    // cache[n] = res;
    // return res;
    // }

    
    // TABLULATION METHOD
    static int tabulation(int n) {
        int cache[] = new int[n + 1];
        cache[0] = 0;
        cache[1] = 1;
        for (int i = 2; i <= n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }

    public static void main(String[] args) throws Exception {
        int n = 8;
        // for memoization method
        // int cache[] = new int[n + 1];
        // System.out.println(fibMemo(n, cache));

        // for tabulation method
        System.out.println(tabulation(n));
    }
}
