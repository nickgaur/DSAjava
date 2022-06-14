public class App {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 6, 4 }, { 5, 1, 2, 6 }, { 9, 5, 1, 2 } };
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                if (arr[i][j] != arr[i + 1][j + 1]) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("TopPlitz Matrix");
        } else {
            System.out.println("Not TopPlitz Matrix");
        }
    }
}
