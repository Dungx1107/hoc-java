package Node;

public class Node {
    String data;
    Node prev;
    Node next;
    
    public Node(String data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
