public class App {
    static void diamond(int n, int row, int col) {
        if (row > n) {
            return;
        }
        printSpaces(n - row);
        if(col % 2 == 0){
            print
        }
        printStars(row);
        System.out.println();
        diamond(n, row + 1, col);
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
        printSpaces(noOfStars - 1);
    }

    public static void main(String[] args) throws Exception {
        int n = 5;
        int row = 1;
        int col = 1;
        diamond(n, row, col);
    }
}
