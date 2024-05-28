package Jobsheet_7;
import java.util.Scanner;

public class MahasiswaMain19 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int jumMhs;
        
        System.out.println("---------------------------------------------------------");
        System.out.print("Masukkan berapa banyak data yang ingin ditambahkan : ");
        jumMhs = s.nextInt();
        
        PencarianMhs19 data = new PencarianMhs19(jumMhs);
        System.out.println("--------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil");
        for(int i = 0; i < jumMhs; i++){
            System.out.println("--------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = s.next();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();
            
            Mahasiswa19 m = new Mahasiswa19(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("--------------------------------------");
        System.out.println("Data keseluruhan mahasiswa : ");
        data.tampil();

        System.out.println("________________________________________");
        System.out.println("________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nim Mahasiswa yang ingin dicari : ");
        System.out.print("Nim : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);

        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("==========================================================");
        System. out.println("menggunakan binary Search") ;


        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

    }
}
