package UAS;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SistemRental19 {
    static List<BarangRental19> barangList = new ArrayList<>();
    static List<TransaksiRental19> transaksiList = new ArrayList<>();

    public void addBarangRental(BarangRental19 barangRental19) {
        barangList.add(barangRental19);
    }

    public void listKendaraan() {
        System.out.println("Daftar Kendaraan Rental Serba Serbi");
        for (BarangRental19 br : barangList) {
            System.out.println(br);
        }
    }

    public void peminjaman(Scanner scanner) {
    System.out.print("Masukkan kode barang: ");
    String kodeBarang = scanner.nextLine().trim();  // Trim to remove extra spaces
    
    System.out.print("Masukkan lama pinjam (dalam jam): ");
    int lamaPinjam;
    try {
        lamaPinjam = scanner.nextInt();
        scanner.nextLine();  // Consume newline after nextInt()
    } catch (InputMismatchException e) {
        System.out.println("Input lama pinjam harus berupa angka.");
        scanner.nextLine();  // Clear the invalid input
        return;
    }

    boolean found = false;
    for (BarangRental19 br : barangList) {
        if (br.noTNKB.equals(kodeBarang)) {
            System.out.print("Masukkan nama peminjam: ");
            String namaPeminjam = scanner.nextLine();

            TransaksiRental19 transaksi = new TransaksiRental19(namaPeminjam, lamaPinjam, br);
            transaksiList.add(transaksi);
            System.out.println("Transaksi berhasil ditambahkan.");
            found = true;
            break;
        }
    }
    
    if (!found) {
        System.out.println("Kode barang tidak ditemukan atau sudah dipinjam.");
    }
}

    public void tampilkanTransaksi() {
        double totalPendapatan = 0;
            System.out.println("Seluruh Transaksi:");
            for (TransaksiRental19 tr : transaksiList) {
            System.out.println(tr);
            totalPendapatan += tr.totalBiaya;
        }
        System.out.println("Total Pendapatan: " + totalPendapatan);
    }

    public void urutkanTransaksi() {
        transaksiList.sort((t1, t2) -> {
          char firstChar1 = t1.namaPeminjam.charAt(0);
          char firstChar2 = t2.namaPeminjam.charAt(0);
      
          if (firstChar1 >= 'A' && firstChar1 <= 'M' && firstChar2 >= 'A' && firstChar2 <= 'M') {
            return t1.barangRental19.noTNKB.compareTo(t2.barangRental19.noTNKB);
          } else if (firstChar1 >= 'N' && firstChar1 <= 'Z' && firstChar2 >= 'N' && firstChar2 <= 'Z') {
            return t1.namaPeminjam.compareTo(t2.namaPeminjam);
          } else if (firstChar1 >= 'A' && firstChar1 <= 'M') {
            return -1; // Names starting with 'A'-'M' come first
          } else {
            return 1; // Names starting with 'N'-'Z' come later
          }
        });
        System.out.println("Transaksi berhasil diurutkan.");
      }
      
}
