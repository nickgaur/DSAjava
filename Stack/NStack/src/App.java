import java.util.*;

class MyStack{
    int capacity = 0;
    int kSize = 0;
    int top[];
    int arr[];
    int next[];
    MyStack(int kSize, int capacity){
        this.kSize = kSize;
        this.capacity = capacity;
        arr = new int [capacity];
        top = new int[kSize];
        next = new int[capacity];        
    }
}

public class App {
    
    public static void main(String[] args) throws Exception {
        MyStack obj = new MyStack(10, 4);
    }
}
