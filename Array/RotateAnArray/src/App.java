public class App {
    static void reverse(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, -100, 3, 99 };
        // int arr[] = { 1, 2, 3, 4, 5 };
        int k = 2;
        // int n = arr.length;

        // NAIVE APPROACH
        // for (int i = 0; i < k; i++) {
        // int temp = arr[n - 1];
        // for (int j = n - 1; j >= 1; j--) {
        // arr[j] = arr[j - 1];
        // }
        // arr[0] = temp;
        // }

        // EFFICIENT SOLUTION
        // TIME: O(N)
        // SPACE: O(N)
        // int tempArr[] = new int[n - k];
        // for (int i = 0; i < k; i++) {
        // tempArr[i] = arr[i];
        // }
        // for (int i = k; i < n; i++) {
        // arr[i - k] = arr[i];
        // }
        // for (int i = 0; i < k; i++) {
        // arr[n - k + i] = tempArr[i];
        // }

        // MOST EFFICIENT APPROACH
        // TIME: O(N)
        // SPACE: O(1)
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        // PRINTING ELEMENTS
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
