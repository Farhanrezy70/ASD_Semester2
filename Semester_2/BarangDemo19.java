import java.util.ArrayList;
import java.util.Scanner;
public class BarangDemo19 {

    public static void main(String[] args) {
        TransaksiBarang brg19 = new TransaksiBarang();
        initBarang(brg19);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Menu Utama =====");
            System.out.println("1. Tampilkan Daftar Barang");
            System.out.println("2. Tampilkan Barang Pembelian");
            System.out.println("3. Lakukan Pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                brg19.tampilkanBarang();
                    break;
                case 2:
                brg19.tampilkanBarangPembelian();
                    break;
                case 3:
                    System.out.print("Masukkan kode barang yang akan dibeli: ");
                    String kodeBarang = scanner.next();
                    brg19.lakukanPembelian(kodeBarang);
                    break;
                case 4:
                    System.out.println("Terima kasih, program selesai.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    public static void initBarang(TransaksiBarang brg19) {
        // Inisialisasi data barang
        brg19.barangs.add(new TransaksiBarang("B001", "Laptop", 8000000, 10));
        brg19.barangs.add(new TransaksiBarang("B002", "Smartphone", 3000000, 15));
        brg19.barangs.add(new TransaksiBarang("B003", "Printer", 1500000, 5));
        brg19.barangs.add(new TransaksiBarang("B004", "Mouse", 50000, 50));
        brg19.barangs.add(new TransaksiBarang("B005", "Keyboard", 150000, 30));
    }
}
