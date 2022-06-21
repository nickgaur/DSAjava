public class App {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 0, 1, 1, 0, 1, 0, 1 };

        // NAIVE APPROACH
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 0) {
        // count++;
        // }
        // }
        // for (int i = 0; i < count; i++) {
        // arr[i] = 0;
        // }
        // for (int i = count; i < arr.length; i++) {
        // arr[i] = 1;
        // }

        // EFFICIENT APPROACH
        int high = arr.length - 1;
        int mid = 0;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    mid++;
                    break;
                case 1: {
                    swap(arr, mid, high);
                    high--;
                    break;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
