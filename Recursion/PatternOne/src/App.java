public class App {
    static void printPattern(int n, int row, int number) {
        if (row > n) {
            return;
        }
        printNumber(number, 1);
        System.out.println();
        printPattern(n, row + 1, number + 1);
    }

    static void printNumber(int number, int row) {
        if (row > number) {
            return;
        }
        System.out.print(number);
        printNumber(number, row + 1);
    }

    public static void main(String[] args) throws Exception {
        int n = 1;
        int row = 1;
        printPattern(n, row, 1);
    }
}
