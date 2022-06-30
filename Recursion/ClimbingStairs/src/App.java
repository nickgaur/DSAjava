public class App {
    static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return (fib(n-1) + fib(n-2));
    }
    static int climbStairs(int n) {
        return fib(n + 1);
    }

    public static void main(String[] args) throws Exception {
        int res = climbStairs(3);
        System.out.println(res);
    }
}