public class App {
    public static String checkSorted(int arr[], int i){
        if(i == arr.length - 1){
            return "YES";
        }
        if(arr[i] <= arr[i + 1]){
            return checkSorted(arr, i+1);
        }
        return "NO";
    }
    public static void main(String[] args) throws Exception {
        int arr[] = {1,2,7,4,5};
        System.out.println(checkSorted(arr, 0));
    }
}
