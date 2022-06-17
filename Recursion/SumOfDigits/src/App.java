public class App {
    public static int sumOfDigits(int n, int sum){
        int t = n % 10;
        if(n <= 0){
            return sum;
        }
        return sumOfDigits(n / 10, t + sum);
    }
    public static void main(String[] args) throws Exception {
        int n = 12345;
        System.out.println(sumOfDigits(n,0));
    }
}
