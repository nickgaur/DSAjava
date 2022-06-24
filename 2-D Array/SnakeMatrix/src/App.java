public class App {
    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 27, 29, 37, 48 }, { 32, 33, 31, 40 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][arr[i].length - j - 1] + " ");
                }
            }
            System.out.println();
        }
    }
}
