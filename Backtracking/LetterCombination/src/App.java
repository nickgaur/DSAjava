import java.util.ArrayList;

public class App {
    static String keys[] = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    static ArrayList<String> letterCombination(String digits) {
        if (digits.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        char singleChar = digits.charAt(0);
        int digit = singleChar - '0';
        String strKeys = keys[digit];
        String remString = digits.substring(1);
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < strKeys.length(); i++) {
            ArrayList<String> returnedList = letterCombination(remString);
            for (String elem : returnedList) {
                // System.out.println(elem);
                result.add(strKeys.charAt(i) + elem); 
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        String str = "23";
        ArrayList<String> res = letterCombination(str);
        System.out.println(res);
    }
}
