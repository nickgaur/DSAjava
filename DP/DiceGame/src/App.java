import java.util.ArrayList;
import java.util.HashMap;

public class App {
    static HashMap<Integer, ArrayList<String>> map = new HashMap<>();
    static int call = 0;
    static ArrayList<String> reachToTen(int currentValue, int endValue) {
        if (currentValue == endValue) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if (currentValue > endValue) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }

        ArrayList<String> result = new ArrayList<>();
        for (int dice = 1; dice <= 6; dice++) {
            int newValue = dice + currentValue;
            ArrayList<String> returnedList = new ArrayList<>();
            if(map.containsKey(newValue)){
                returnedList = map.get(newValue);
            }
            else{
                returnedList = reachToTen(newValue, endValue);
                call++;
                map.put(newValue, returnedList);
            }
            for (String elem : returnedList) {
                result.add(elem + dice);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> list = reachToTen(0, 10);
        System.out.println(list);
        System.out.println("No of recursive calls: " + call);
    }
}
