public class App {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};

        // int arr2[] = new int[arr.length];
        // int t = 0;
        // for(int i=arr.length-1; i>=0; i--){
        //     arr2[t] = arr[i];
        //     t++;
        // }


        // for(int i=arr.length-1; i>=0; i--){
        //     arr2[arr.length - 1 - i] = arr[i];
        // }

        // TWO POINTER APPROACH
        int first = 0;
        int last = arr.length-1;
        while(last > first){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        // for(int element: arr2){
        //     System.out.print(element + " ");
        // }

        // WITHOUT TWO POINTER APPROACH
        for(int i=0; i<arr.length; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // PRINTING THE ELEMENTS
        for(int element: arr){
            System.out.print(element + " ");
        }
        System.out.println("");


    }
}
