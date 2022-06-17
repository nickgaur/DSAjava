public class App {
    public static void main(String[] args) throws Exception {
        int n = 123;
        int res = 0;
        while(n > 9){
            int t = n % 10;
            res += t;
            n /= 10;
        }
        System.out.println(res + n);
    }
}
