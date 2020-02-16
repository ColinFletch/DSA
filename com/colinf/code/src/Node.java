public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class LinkedList {
    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next; //get to end
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
        return;
    }

    public void deleteWithValue(int data){
        
    }

}