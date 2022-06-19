public class App {
    // RECURSIVE APPROACH
    public static int recFib(int n) {
        if (n <= 1) {
            return n;
        }
        return recFib(n - 1) + recFib(n - 2);
    }

    public static void main(String[] args) throws Exception {
        int n = 8;
        System.out.println(recFib(n));

        // ITERATIVE APPROACH
        // int a = 0;
        // int b = 1;
        // int c = 1;
        // for(int i=0; i<n; i++){
        //         c = a + b;
        //         a = b;
        //         b = c;
        // }
        // System.out.println(c);
    }
}
