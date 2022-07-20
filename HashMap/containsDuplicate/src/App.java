import java.util.HashMap;

public class App {

    static boolean containsDuplicate(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length;i++){
        
            if(map.get(arr[i]) == null){
                map.put(arr[i], arr[i]);
            }
            else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(arr));
    }
}
