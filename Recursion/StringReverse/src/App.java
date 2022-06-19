public class App {
    static String reverseString(String str, String res, int i) {
        if (res.length() == str.length()) {
            return res;
        }
        res += str.charAt(i);
        return reverseString(str, res, i-1);
    }

    public static void main(String[] args) throws Exception {
        String str = "hello";
        // int first = 0;
        String res = reverseString(str, "", str.length() - 1);
        System.out.println(res);
    }
}
