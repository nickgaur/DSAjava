import java.util.ArrayList;

public class App {
    static ArrayList<String> permute(String str) {

        if (str.length() == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }
        char singleChar = str.charAt(0);
        String remainingString = str.substring(1);

        ArrayList<String> returnedList = permute(remainingString);
        ArrayList<String> result = new ArrayList<>();
        for (String elem : returnedList) {
            for (int i = 0; i <= elem.length(); i++) {
                // if (i == 0) {
                //     result.add(singleChar + elem);
                // } else if (i == elem.length() - 1) {
                //     result.add(elem + singleChar);
                // } else {
                    // BREAKING ORIGINAL STRING INTO TWO SUBSTRINGS
                    // String leftSubString = elem.substring(0, i);
                    // String rightSubString = elem.substring(i, elem.length());
                    // result.add(leftSubString + singleChar + rightSubString);
                // }

                // OR
                    // USING STRINGBUFFER
                    StringBuffer sb = new StringBuffer(elem);
                    sb.insert(i, singleChar);
                    result.add(sb.toString());
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        String str = "abcd";
        ArrayList<String> list = permute(str);
        System.out.println(list);

    }
}
