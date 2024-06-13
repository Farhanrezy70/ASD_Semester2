package UAS;

public class TransaksiRental19 {
    static int kodeCounter = 1;
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    BarangRental19 barangRental19;

    public TransaksiRental19(String namaPeminjam, int lamaPinjam, BarangRental19 barangRental) {
        this.kodeTransaksi = kodeCounter++;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.barangRental19 = barangRental;
        this.totalBiaya = calculateTotalBiaya();
    }

    private double calculateTotalBiaya() {
        double biayaSewa = barangRental19.jenisKendaraan.equals("Motor") ? 25000 : 40000;
        double total = lamaPinjam * biayaSewa;

        if (lamaPinjam >= 48 && lamaPinjam <= 78) {
            total *= 0.90;
        } else if (lamaPinjam > 78) {
            total *= 0.80;
        }
        // Assuming all renters are members
        total -= 25000;

        return total;
    }
}