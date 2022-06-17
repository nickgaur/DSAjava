public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = { 0, 1, 1, 0, 1, 0, 1 };
        int t = 0;

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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[t];
                arr[t] = temp;
                t++;
            } else {
                t = i;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
