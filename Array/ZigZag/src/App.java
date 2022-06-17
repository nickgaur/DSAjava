public class App {
    public static void main(String[] args) {
        int arr[] = {4,3,7,8,6,2,1};

        for(int i=0; i < arr.length-1; i++){
            if(i % 2 == 0){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            else{
                if(arr[i] < arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        // PRINTING THE ARRAY
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
