public class App {
    public static void main(String[] args) {
        int arr[][] = { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };
        int largest = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            int smallest = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];
                }
            }
            if (smallest > largest) {
                largest = smallest;
            }
        }
        System.out.println(largest);
    }
}
