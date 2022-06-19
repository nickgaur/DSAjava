public class App {
    static void printPattern(int n, int row) {
        if (row == 0) {
            return;
        }
        printStars(row);
        System.out.println();
        printPattern(n, row - 1);
    }

    static void printStars(int noOfStars) {
        if (noOfStars == 0) {
            return;
        }
        System.out.print("*");
        printStars(noOfStars - 1);
    }

    public static void main(String[] args) throws Exception {
        int n = 5;
        int row = n;
        printPattern(n, row);
    }
}
