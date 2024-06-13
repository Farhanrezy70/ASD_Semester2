package UAS;

public class BarangRental19 {
    String noTNKB;
    String namaKendaraan;
    String jenisKendaraan;
    int tahun;
    int biayaSewa;

    public BarangRental19(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa) {
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
    }
    
    public String toString() {
        return noTNKB + " " + namaKendaraan + " " + jenisKendaraan + " " + tahun + " " + biayaSewa;
    }
}
