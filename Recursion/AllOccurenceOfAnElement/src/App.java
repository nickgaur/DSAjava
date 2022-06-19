public class App {
    static void findAllOccurence(int arr[], int target, int i) {
        if (i == arr.length) {
            return;
        } else if (arr[i] == target) {
            System.out.print(i + ", ");
        }
        findAllOccurence(arr, target, i + 1);
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 10, 20, 39, 19, 10, 78, 20, 10 };
        int target = 10;
        System.out.print("Indexes of found element are: ");
        findAllOccurence(arr, target, 0);
    }
}
