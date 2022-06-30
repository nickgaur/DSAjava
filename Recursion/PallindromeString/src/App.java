public class App {
    static boolean isPallindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        } else if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPallindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) throws Exception {
        String str = "nitin";
        boolean check = isPallindrome(str, 0, str.length() - 1);
        System.out.println(check);
    }
}
