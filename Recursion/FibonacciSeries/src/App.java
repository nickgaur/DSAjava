public class App {
    public static int fib(int n, int i){
        int t = i;
        System.out.print(i + " ");
        if(n == 0 || n == 1){
            return 1;
        }
        return fib(n-1, i + t);
    }
    public static void main(String[] args) throws Exception {
        int n = 4;
        System.out.println(fib(n,1));
    }
}
