public class App {
    public static void main(String[] args) {
        int arr[] = { 80, 10, 50, 20, 30, 100, 40 };
        int largest = arr[0];
        int secondLargest = -1;
        int thirdLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest) {
                if (arr[i] > secondLargest) {
                    if (secondLargest == -1) {
                        secondLargest = arr[i];
                    } else {
                        thirdLargest = secondLargest;
                        secondLargest = arr[i];
                    }
                } else if (arr[i] < secondLargest) {
                    if (arr[i] > thirdLargest || thirdLargest == -1) {
                        thirdLargest = arr[i];
                    }
                }
            }
        }
        if (thirdLargest == -1) {
            System.out.println("there is no third largest element");
        } else {
            System.out.println(thirdLargest);
        }
    }
}