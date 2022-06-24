public class App {
    static int josephus(int n, int k){


        return josephus(n-1, k) + k;
    }
    public static void main(String[] args) throws Exception {
     System.out.println(josephus(3, 2));
    }
}
