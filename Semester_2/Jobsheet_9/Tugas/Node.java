package Jobsheet_9.Tugas;

public class Node {
    String question;
    String answer;
    Node next;
    
    public Node(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.next = null;
    }
}