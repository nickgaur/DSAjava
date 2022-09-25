class TwoStack{
    int arr[];
    int capacity;
    int leftTop;
    int rightTop;
    TwoStack(int capacity){
        arr = new int [capacity];
        this.capacity = capacity;
        this.leftTop = -1;
        this.rightTop = capacity;
    }

    void leftPush(int element){
        if(leftTop == rightTop-1){
            throw new RuntimeException("Stack is full");
        }
        leftTop++;
        arr[leftTop] = element;
    }
    
    void rightPush(int element){
        if(rightTop == leftTop+1){
            throw new RuntimeException("Stack is full");
        }
        rightTop--;
        arr[rightTop] = element;
    }

    int leftPop(){
        if(isLeftEmpty()){
            throw new RuntimeException("Left Stack is empty");
        }
        int t = arr[leftTop];
        arr[leftTop] = 0;
        leftTop--;
        return t;
    }

    int rightPop(){
        if(isRightEmpty()){
            throw new RuntimeException("Right Stack is empty");
        }
        int t = arr[rightTop];
        arr[rightTop] = 0;
        rightTop++;
        return t;
    }

    int leftPeek(){
        if(isLeftEmpty()){
            throw new RuntimeException("Left Stack is empty");
        }
        return arr[leftTop];
    }

    int rightPeek(){
        if(isRightEmpty()){
            throw new RuntimeException("Right Stack is empty");
        }
        return arr[rightTop];
    }

    boolean isLeftEmpty(){
        return leftTop == -1 ? true : false;
    }

    boolean isRightEmpty(){
        return rightTop == capacity ? true : false;
    }

}
public class App {
    public static void main(String[] args) throws Exception {
        TwoStack stack = new TwoStack(10);
        stack.leftPush(10);
        stack.leftPush(20);
        stack.leftPush(30);

        stack.rightPush(100);
        stack.rightPush(200);
        stack.rightPush(300);

        System.out.println(stack.leftPeek());
        System.out.println(stack.rightPeek());
        
        System.out.println("Left Pop: ");
        System.out.println(stack.leftPop());
        System.out.println(stack.leftPop());

        System.out.println("Right Pop: ");
        System.out.println(stack.rightPop());
        System.out.println(stack.rightPop());
    }
}
