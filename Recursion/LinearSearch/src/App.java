public class App {
    static int search(int arr[], int target, int i) {
        if (i == arr.length) {
            return -1;
        } else if (arr[i] == target) {
            return i;
        }
        return search(arr, target, i + 1);
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 100, 29, 6, 2, 38, 42 };
        int target = 38;
        System.out.println(search(arr, target, 0));
    }
}
