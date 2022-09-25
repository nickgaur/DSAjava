import java.util.Scanner;

class Node<T> {
    T data;
    Node next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListOperations<T> {
    // Add Node at the end
    void addAtEnd(T data) {

    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        LinkedListOperations<Node> obj = new LinkedListOperations<>();
        while(true){
            System.out.println("1. Add Node at the end");
            System.out.println("2. Print Linked List");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the data for the node: ");
                    int data = scanner.nextInt();
                    Node<Integer> node = new Node<>(data);
                    obj.addAtEnd(node);
                    break;

                case:2
                
                
            }
            
        }
    }
}
