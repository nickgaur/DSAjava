public class App {
    static int rec(int n) {
        if (n == 1) {
            return 1;
        }
        return (rec(n / 2) * 10) + (n % 2);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(rec(6));
    }
}
