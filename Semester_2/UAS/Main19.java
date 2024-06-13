package UAS;

import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemRental19 sistemRental = new SistemRental19();

        // Pre-fill the vehicle data
        sistemRental.addBarangRental(new BarangRental19("S 4567 IV", "Honda Beat", "Motor", 2017, 10000));
        sistemRental.addBarangRental(new BarangRental19("N 4511 VS", "Honda Vario", "Motor", 2018, 10000));
        sistemRental.addBarangRental(new BarangRental19("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 30000));
        sistemRental.addBarangRental(new BarangRental19("AB 4321 A", "Toyota Innova", "Mobil", 2019, 60000));
        sistemRental.addBarangRental(new BarangRental19("B 1234 AG", "Toyota Avanza", "Mobil", 2021, 25000));

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    sistemRental.listKendaraan();
                    break;
                case 2:
                    sistemRental.peminjaman(scanner);
                    break;
                case 3:
                    sistemRental.tampilkanTransaksi();
                    break;
                case 4:
                    sistemRental.urutkanTransaksi();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
