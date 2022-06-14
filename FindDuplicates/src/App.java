import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        int arr[] = {1, 3, 1, 3, 4, 2 ,2};

        // NAIVE APPROACH
        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] == arr[j]) {
        // System.out.println(arr[i]);
        // break;
        // }
        // }
        // }

        // EFFICIENT APPROACH
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        // int count = 1;
        // if (map.get(arr[i]) != null) {
        // count = map.get(arr[i]) + 1;
        // map.put(arr[i], count);
        // } else {
        // map.put(arr[i], count);
        // }
        // }

        // for (int i = 0; i < map.size(); i++) {
        // if (map.get(arr[i]) > 1) {
        // System.out.println(arr[i]);
        // break;
        // }
        // }

        //
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;
            int value = arr[index];
            if (value < 0) {
                System.out.println(index + 1);
                // return;
            } else {
                arr[index] = -1 * arr[index];
            }
        }
    }
}
