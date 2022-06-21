public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = { -1, -100, 3, 99 };
        // int arr[] = { 1, 2, 3, 4, 5 };
        int k = 2;

        // NAIVE APPROACH
        // for (int i = 0; i < k; i++) {
        // int temp = arr[arr.length - 1];
        // for(int j=arr.length-1; j>=1; j--){
        // arr[j] = arr[j-1];
        // }
        // arr[0] = temp;
        // }

        // EFFICIENT SOLUTION
        int tempArr[] = new int[arr.length - k];
        for (int i = 0; i <= k; i++) {
            tempArr[i] = arr[i];
        }
        // for (int elem : tempArr) {
        // System.out.print(elem + " ");
        // }
        // System.out.println();
        for (int i = k + 1; i < arr.length; i++) {
            arr[i - k - 1] = arr[i];
        }
        // for (int elem : arr) {
        //     System.out.print(elem + " ");
        // }
        for (int i = 0; i <= k; i++) {
        arr[i + k] = tempArr[i];
        }

        for (int elem : arr) {
        System.out.print(elem + " ");
        }
        System.out.println();
    }
}
