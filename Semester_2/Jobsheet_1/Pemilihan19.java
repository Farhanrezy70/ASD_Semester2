import java.util.Scanner;
public class Pemilihan19{

    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=========================");
        System.out.print("Masukkan Nilai Tugas : ");
        float tugas = input19.nextFloat();
        System.out.print("Masukkan Nilai Kuis  : ");
        float kuis = input19.nextFloat();
        System.out.print("Masukkan Nilai UTS   : ");
        float uts = input19.nextFloat();
        System.out.print("Masukkan Nilai UAS   : ");
        float uas = input19.nextFloat();
        System.out.println("=========================");
        System.out.println("=========================");

        String message1 = "Nilai tidak valid";
        if (tugas > 100){
            System.out.println(message1);
            return;
        }else if (kuis > 100){
            System.out.println(message1);
            return;
        }else if (uts > 100){
            System.out.println(message1);
            return;
        }else if (uas > 100){
            System.out.println(message1);
            return;
        }

        float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);
        System.out.println("Nilai akhir = " + total);

        if (total >= 80){
            System.out. println("Nilai Huruf A");
        }else if (total > 73){
            System.out. println("Nilai Huruf B+");
        }else if (total > 65){
            System.out. println("Nilai Huruf B");
        }else if (total > 60){
            System.out. println("Nilai Huruf C+");
        }else if (total > 50){
            System.out. println("Nilai Huruf C");
        }else if (total > 39){
            System.out. println("Nilai Huruf D");
        }else {
            System.out. println("Nilai Huruf E");
        }

        System.out.println("=========================");
        if (total < 39){
            System.out.println("Anda Tidak Lulus");
        }else
            System.out.println("Selamat Anda Lulus");
        
    }
}