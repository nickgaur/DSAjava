public class App {
    public static int sumOfDigits(int n, int sum){
        if(n <= 9){
            return sum + n;
        }
        int t = n % 10;
        return sumOfDigits(n / 10, t + sum);
    }
    public static void main(String[] args) throws Exception {
        int n = 12345;
        System.out.println(sumOfDigits(n,0));
    }
}
