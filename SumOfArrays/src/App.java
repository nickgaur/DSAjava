public class App {
    public static void main(String[] args) {
        int first[] = { 5, 1, 3, 1 };
        int second[] = { 9, 2 };
        int third[] = new int[first.length > second.length ? first.length : second.length];
        int carry = 0;

        // FOR ARRAY OF SAME OR DIFFERENT SIZE
        int i = first.length - 1;
        int j = second.length - 1;
        int k = third.length - 1;
        while (i >= 0 || j >= 0) {
            if (j < 0) {
                third[k] = (first[i] + carry) % 10;
                carry = (first[i] + carry) / 10;
            } else if (i < 0) {
                third[k] = (first[j] + carry) % 10;
                carry = (first[j] + carry) / 10;
            } else {
                third[k] = (first[i] + second[j] + carry) % 10;
                carry = (first[i] + second[j] + carry) / 10;
            }
            i--;
            j--;
            k--;
        }

        // FOR BOTH ARRAY OF SAME LENGTH
        // for (int i = first.length - 1; i >= 0; i--) {
        // for (int j = second.length - 1; j >= 0; j--) {
        // third[i] = (first[i] + second[i] + carry) % 10;
        // carry = (first[i] + second[i] + carry) / 10;
        // }
        // }

        // PRINTING THE ARRAY
        if (carry > 0) {
            System.out.print(carry + " ");
        }
        for (int elem : third) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
