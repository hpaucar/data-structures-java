public class Node {
    int key;
    Node prev;
    Node next;

    public Node(int key) {
        this.key = key;
        this.prev = null;
        this.next = null;
    }
}