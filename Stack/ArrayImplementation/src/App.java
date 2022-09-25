import javax.management.RuntimeErrorException;

/* =======================================
      Implementation of stack in array 
  ========================================*/
  
class MyStack{
    int arr[];
    int top;
    MyStack(int capacity){
        arr = new int[capacity];
        top = -1;
    }

    void push(int element){
        if(top == arr.length - 1){
            throw new RuntimeException("Stack is full");
        }
        top++;
        arr[top] = element;
    }

    int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }
    int pop() {
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        int val = arr[top];
        arr[top] = 
        top--;
        return val;
    }

    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        MyStack st = new MyStack(50);
        // System.out.println(st.peek());
        // System.out.println(st.pop());
        st.push(10);
        st.push(7);
        st.push(10);
        st.push(72);
        st.push(72);
        st.push(72);
        st.push(72);
        System.out.println(st.isEmpty());

    }
}
