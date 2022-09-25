class Node {
    int data;
    Node next;

    Node(int n) {
        this.data = n;
    }
}

public class App {

    static void func(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) throws Exception {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        func(head);
    }
}
