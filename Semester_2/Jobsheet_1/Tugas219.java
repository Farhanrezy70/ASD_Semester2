import java.util.Scanner;

public class Tugas219 {
    public static void hitungKecepatan(){
        Scanner input10 = new Scanner(System.in);
        System.out.print("Masukkan jarak (Km): ");
        double s = input10.nextDouble();

        System.out.print("Masukkan waktu (jam): ");
        double t = input10.nextDouble();

        double v = s / t;
        System.out.print("Kecepatan adalah " + v + "Km/jam");

    }
    public static void hitungJarak(){
        Scanner input10 = new Scanner(System.in);
        System.out.print("Masukkan kecepatan(Km/jam): ");
        double v = input10.nextDouble();
        System.out.print("Masukkan waktu (jam): ");
        double t = input10.nextDouble();
        double s = v * t;
        System.out.print("Jarak adalah " + s + "Km");
    }
    public static void hitungWaktu(){
        Scanner input10 = new Scanner(System.in);
        System.out.print( "Masukkan jarak(Km):");
        double s = input10.nextDouble();

        System.out.print("Masukkan kecepatan (km/jam): ");
        double v = input10.nextDouble();

        double t = s / v;
        System.out.println("Waktu adalah " + t + "jam");
    }
    public static void main (String[] args){
        Scanner input10 = new Scanner(System.in);

        System.out.println("Pilihan rumus: ");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");

        System.out.print("Masukkann pilihan: ");
        int pilihan = input10.nextInt();

        if (pilihan == 1){
            hitungKecepatan();
        }else if(pilihan == 2){
            hitungJarak();
        }else if(pilihan == 3){
            hitungWaktu();
        }else{
            System.out.println("Pilihan tidak valid");
        }
    }
}
