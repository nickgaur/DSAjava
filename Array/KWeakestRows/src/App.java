import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        int arr[][] = { { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1 } };
        Map<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            res.put(i, count);
        }
        int index = 0;
        for (int i = 0; i < res.size(); i++) {
            int min = res.get(i);
            for (int j = 0; j < res.size(); j++) {
                if (res.get(j) > -1 && res.get(j) < min) {
                    min = res.get(j);
                    index = j;
                }
            }

            // else{
            // min = res.get()
            // }
            System.out.println(index);
            res.put(index, -1);
        }
    }
}
