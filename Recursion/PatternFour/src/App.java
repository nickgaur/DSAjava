public class App {
    static void printPattern(int n, int row, int character) {
        if (row > n) {
            return;
        }
        printCharacter(character, row);
        System.out.println();
        printPattern(n, row + 1, character + 1);
    }

    static void printCharacter(int character, int row) {
        if (row == 0) {
            return;
        }
        System.out.print(Character.toString(character));
        printCharacter(character, row - 1);
    }

    public static void main(String[] args) throws Exception {
        int n = 4;
        int row = 1;
        int character = 65;
        printPattern(n, row, character);
    }
}
