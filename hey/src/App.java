import java.util.ArrayList;
import java.util.Scanner;

public class App {
    

    public static void main(String[] args) throws Exception {
        int arr1[] = {4,5,8};
        int arr2[] = {10,9,1,8};
        int d = 2;
        int count = 0;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
