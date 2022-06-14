public class App {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 1, 4, 6, 5, 8 };
        int XOR = 0;
        for (int i = 1; i <= arr.length + 1; i++) {
            XOR = XOR ^ i;
        }
        for (int i = 0; i < arr.length; i++) {
            XOR = XOR ^ arr[i];
        }
        System.out.println(XOR);
    }
}
