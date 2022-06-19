public class App {
    static int findLast(int arr[], int target, int i) {
        if (i < 0) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return findLast(arr, target, i - 1);
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 10, 20, 39, 19, 10, 78, 20 };
        int target = 10;
        System.out.println(findLast(arr, target, arr.length - 1));
    }
}
