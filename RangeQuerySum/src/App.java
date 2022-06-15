public class App {
    public static int getSum(int lower, int upper) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        // int sum =
        if (lower != 0) {
            return prefixSum[upper] - prefixSum[lower - 1];
        }
        return prefixSum[upper];
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getSum(0, 2));
    }
}
