package Jobsheet_9.Tugas;

public class LinkedList {
    Node head;
    
    public LinkedList() {
        this.head = null;
    }
    
    public void addNode(String question, String answer) {
        Node newNode = new Node(question, answer);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    public Node getHead() {
        return head;
    }
}
