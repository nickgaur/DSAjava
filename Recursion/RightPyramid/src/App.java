public class App {
    static void rightPyramid(int n, int row) {
        if (row > n) {
            return;
        }
        printSpaces(n - row);
        printStars(row);
        System.out.println();
        rightPyramid(n, row + 1);
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
        System.out.print("*");
        printStars(noOfStars - 1);
    }

    public static void main(String[] args) throws Exception {
        int n = 5;
        int row = 1;
        rightPyramid(n, row);
    }
}
