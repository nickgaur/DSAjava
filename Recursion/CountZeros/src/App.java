public class App {

    public static int countZeros(int n, int count) {
        int t = n % 10;
        if (n <= 0) {
            return count;
        }
        else if(t == 0){
            count += 1;
        }
        return countZeros(n / 10, count);
    }

    public static void main(String[] args) throws Exception {
        int n = 102098003;
        int count = 0;
        System.out.println(countZeros(n, count));
    }
}
