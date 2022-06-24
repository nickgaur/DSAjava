import java.util.ArrayList;

public class App {
    static ArrayList<String> subSequence(String str){
        if(str.length() == 0){
            ArrayList<String> blank = new ArrayList<String>();
            blank.add("");
            return blank;
        }
        char singleChar = str.charAt(0);
        String subStr = str.substring(1);
        ArrayList<String> list = subSequence(subStr);
        ArrayList<String> result = new ArrayList<String>();
        for(String elem: list){
            result.add(elem);
            result.add(singleChar + elem);
        }
        return result;
    } 
    public static void main(String[] args) throws Exception {
        String str = "nick";
        ArrayList<String> list = subSequence(str);
        System.out.print(list);
    }
}
