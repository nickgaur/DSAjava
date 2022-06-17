public class App {
    public static void main(String[] args) throws Exception {
        int arr1[][] = { { 1, 2 }, { 3, 4 } };
        int arr2[][] = { { 4, 2 }, { 2, 1 } };
        int resMatrix[][] = new int[2][2];
        for (int i = 0; i < resMatrix.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                for (int k = 0; k < arr1.length; k++) {
                    resMatrix[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        for (int arr[] : resMatrix) {
            for (int elem : arr) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
