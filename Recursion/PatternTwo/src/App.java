public class App {
    static void printPattern(int n, int row, int number) {
        if (row > n) {
            return;
        }
        printNumber(number, row);
        System.out.println();
        printPattern(n, row + 1, number + row);
    }

    static void printNumber(int number, int row) {
        if (row == 0) {
            return;
        }
        System.out.print(number + " ");
        printNumber(number + 1, row - 1);
    }

    public static void main(String[] args) throws Exception {
        int n = 5;
        int row = 1;
        int number = 1;
        printPattern(n, row, number);
    }
}
