public class App {
    // tabulation method
    static int tabulation(int start, int end){
        int arr[] = new int[end+1];
        arr[end] = 1;
        for(int i=end-1; i >= 0; i--){
            int count = 0;
            for(int dice = 1; dice <= 6 && dice + i < arr.length; dice++){
                count += arr[dice + i];
            }
            arr[i] = count;
        }
        return arr[0];
    }
    public static void main(String[] args) {
        System.out.println(tabulation(1, 10));
    }
}
