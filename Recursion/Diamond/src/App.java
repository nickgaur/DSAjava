public class App {

    // PRINTING UPPER HALF
    static void printUpperHalf(int n, int row) {
        if (row > n) {
            return;
        }
        printSpaces(n - row);
        printStars(row);
        System.out.println();
        printUpperHalf(n, row + 1);
    }

    static void printSpaces(int noOfSpaces) {
        if (noOfSpaces == 0) {
            return;
        }
        System.out.print(" ");
        printSpaces(noOfSpaces - 1);
    }

    static void printStars(int noOfStars) {

        if (noOfStars == 0) {
            return;
        }
        System.out.print("* ");
        printStars(noOfStars - 1);
    }

    // PRINTING LOWER HALF
    static void printLowerHalf(int n, int row) {
        if (row == 0) {
            return;
        }
        printSpaces(n - row);
        printStars(row);
        System.out.println();
        printLowerHalf(n, row - 1);
    }

    public static void main(String[] args) throws Exception {
        int n = 6;
        int row = 1;
        // PRINT UPPER HALF
        printUpperHalf(n, row);

        // PRINT LOWER HALF
        row = n;
        printLowerHalf(n, row);
    }
}
