import java.util.ArrayList;

public class App {

    static ArrayList<String> generateParanthesis(int n, String currString, int opening, int closing) {
        if (currString.length() == 2*n) {
            ArrayList<String> list = new ArrayList<>();
            list.add(currString);
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> finalResult = new ArrayList<>();
        if (opening < n) {
            ArrayList<String> returnedList = generateParanthesis(n, currString + "(", opening + 1, closing);
            for(String elem: returnedList){
                result.add(elem);
            }
        }
        if (closing < opening) {
            ArrayList<String> returnedList2 = generateParanthesis(n, currString + ")", opening, closing + 1);
            for(String elem: returnedList2){
                result.add(elem);
            }
        }
        for(String elem: result){
            finalResult.add(elem);
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(generateParanthesis(2, "", 0, 0));
    }
}
