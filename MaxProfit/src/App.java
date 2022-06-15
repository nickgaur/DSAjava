public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = { 1, 5, 3, 8, 12 };
        int profit = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                profit += (arr[i + 1] - arr[i]);
            }
        }
        System.out.println(profit);
    }
}
