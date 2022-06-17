public class App {
    public static void main(String[] args) {
        int first[] = { 5, 1, 5, 4 };
        int second[] = { 2, 9 };
        int third[] = new int[first.length > second.length ? first.length : second.length];
        int i = first.length - 1;
        int j = second.length - 1;
        int k = third.length - 1;
        
        // ASSUMING SUBTRACTING A - B
        while (i >= 0 || j >= 0) {
            int carry = 0;
            if(j < 0){
                third[k] = first[i];
            }
            else if (first[i] >= second[j]) {
                third[k] = first[i] - second[j];
            } else if (first[i] < second[j]) {
                carry = 10 + first[i];
                third[k] = carry - second[j];
                first[i - 1]--;
            }
            i--;
            j--;
            k--;
        }

        // FOR B - A
        // if(first.length < second.length || (first.length == second.length && first[0] < second[0])){
        //     System.out.println("-");
        // }
        for (int t : third) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
