public class App {

    // BRUTEFORCE APPROACH
    // public static int largest(int arr[]) {
    // int lar = 0;
    // for (int i = 1; i < arr.length; i++) {
    // if (arr[i] > arr[lar]) {
    // lar = i;
    // }
    // }
    // return lar;
    // }

    public static void main(String[] args) {
        int arr[] = { 20, 1, 4, 2, 15, 6, 8, 3 };

        // NAIVE APPROACH
        // int largest = largest(arr);
        // int secondLargest = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if(arr[i] > arr[secondLargest] && arr[i] != arr[largest]){
        // secondLargest = i;
        // }
        // }
        // System.out.println(arr[secondLargest]);

        // EFFICIENT METHOD
        int largest = 0;
        int secondLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                secondLargest = largest;
                largest = i;
            } else if (arr[i] < arr[largest]) {
                if (secondLargest == -1 || arr[i] > arr[secondLargest]) {
                    secondLargest = i;
                }
                // else if (arr[i] > arr[secondLargest]) {
                // secondLargest = i;
                // }
            }
        }
        if (secondLargest == -1) {
            System.out.println("All Elements Are Equal");
        } else {
            System.out.println(arr[secondLargest]);
        }
    }
}
