public class App {
    static int josephus(int n, int k) {

        if (n == 1) {
            return 0;
        }
        return ((josephus(n - 1, k) + k) % n);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(josephus(2, 2));
    }
}
