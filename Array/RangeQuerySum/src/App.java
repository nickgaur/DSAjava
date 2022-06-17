public class App {
    public static int getSum(int arr[], int lower, int upper) {
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

    public static int getMax(int arr[]) {
        int prefixMax[] = new int[arr.length];
        prefixMax[0] = arr[0];
        for (int i = 1; i < prefixMax.length; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], arr[i]);
        }
        for (int i : prefixMax) {
            System.out.print(i + " ");
        }
        System.out.println();
        return prefixMax[prefixMax.length - 1];
    }

    public static void main(String[] args) throws Exception {
        // int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        // System.out.println(getSum(arr,0, 2));
        int arr2[] = { 90, 10, 20, 100, 11, 200, 20, 300, 500 };
        System.out.println(getMax(arr2));
    }
}
