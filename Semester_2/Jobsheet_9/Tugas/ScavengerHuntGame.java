package Jobsheet_9.Tugas;
import java.util.Scanner;

public class ScavengerHuntGame {
    LinkedList points;
    
    public ScavengerHuntGame() {
        points = new LinkedList();
    }
    
    public void addPoint(String question, String answer) {
        points.addNode(question, answer);
    }
    
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        Node current = points.getHead();
        
        while (current != null) {
            System.out.println(current.question);
            String userAnswer = scanner.nextLine();
            
            if (userAnswer.equalsIgnoreCase(current.answer)) {
                System.out.println("Benar! Menuju point berikutnya...");
                current = current.next;
            } else {
                System.out.println("Salah! Coba lagi");
            }
        }
        
        System.out.println("Selamat! Kamu menemukan harta karun!");
        scanner.close();
    }
    
    public static void main(String[] args) {
        ScavengerHuntGame game = new ScavengerHuntGame();
        game.addPoint("Apa Ibukota Jawa Timur?", "Surabaya");
        game.addPoint("berapa 8 + 4?", "12");
        game.addPoint("Warna langit di siang hari ?", "Biru");
        
        game.startGame();
    }
}