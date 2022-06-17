public class App {
    public static void main(String[] args) throws Exception {
        int n = 1209803;
        int count = 0;
        while (n > 0) {
            int t = n % 10;
            if (t == 0) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
