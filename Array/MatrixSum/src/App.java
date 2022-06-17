public class App {
    public static void main(String[] args) throws Exception {
        int arr1[][] = { { 1, 2 }, { 3, 4 } };
        int arr2[][] = { { 1, 2 }, { 3, 4 } };
        int resMatrix[][] = new int[2][2];
        for (int i = 0; i < arr1.length; i++) {
            for(int j=0; j<arr2.length; j++){
                resMatrix[i][j] = arr1[i][j] + arr2[i][j]; 
            }
        }
        for(int arr[]: resMatrix){
            for(int elem: arr){
                System.out.print(elem + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
