import java.util.Stack;

public class App {
    static int [] approach1(int arr[]){
        int []result = new int[arr.length];
        result[0] = -1;
        for(int i=1; i<arr.length; i++){
            int j;
            for(j = i-1; j>=0; j--){
                if(arr[j] > arr[i]){
                    result[i] = arr[j];
                    break;
                }
            }
            if(j == -1){
                result[i] = -1;
            }
        }
        return result;
    }

    static int [] approach2(int arr[]){
        int []result = new int[arr.length];
        result[0] = -1;
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i=1; i<arr.length; i++){
            while(!stack.empty() && arr[i] > stack.peek()){
                stack.pop();
            }
            if(stack.empty()){
                result[i] = -1;
            }
            else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        int arr[] = {10,4,2,20,40,12,30};
        int arr1[] = approach1(arr);
        for(int i: arr1){
            System.out.print(i + " ");
        }
        System.out.println();

        // int arr2[] = approach2(arr);
        // for(int i: arr2){
        //     System.out.print(i + " ");
        // }
        // System.out.println();
    }
}
