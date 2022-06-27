import java.util.ArrayList;

public class App {
    static ArrayList<String> getMaze(int currRow, int currCol, int destRow, int destCol) {
        if (currRow == destRow && currCol == destCol) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if (currRow > destRow || currCol > destCol) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        ArrayList<String> result = new ArrayList<>();

        ArrayList<String> hResult = getMaze(currRow, currCol + 1, destRow, destCol);
        for (String elem : hResult) {
            result.add('H' + elem);
        }

        ArrayList<String> vResult = getMaze(currRow + 1, currCol, destRow, destCol);
        for (String elem : vResult) {
            result.add('V' + elem);
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = getMaze(0, 0, 2, 2);
        System.out.println(list);
    }
}
