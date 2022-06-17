import java.util.*;

public class App {
    public static void main(String[] args) {
        int arr[] = { 10, 50, 100, 60, 70, 2 };
        int temp = arr[arr.length - 1];
        ArrayList<Integer> leader = new ArrayList<Integer>();
        leader.add(temp);
        // NAIVE APPROACH
        // for (int i = 0; i < arr.length - 1; i++) {
        //     boolean flag = true;
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[j] > arr[i]) {
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if (flag) {
        //         leader.add(arr[i]);
        //     }
        // }
        // leader.add(arr[arr.length - 1]);

        // EFFICIENT APPROACH
        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] > temp){
                leader.add(arr[i]);
                temp = arr[i];
            }
        }

        // PRINTING ARRAY
        for (int ele : leader) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
