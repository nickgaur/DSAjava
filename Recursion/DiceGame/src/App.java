import java.util.ArrayList;

public class App {
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
            ArrayList<String> returnedList = reachToTen(dice + currentValue, endValue);
            for (String elem : returnedList) {
                result.add(elem + dice);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> list = reachToTen(0, 10);
        System.out.println(list);
    }
}
