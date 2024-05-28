import java.util.ArrayList;
    public class Barang19 {
    public int kode, harga, stok;
    public String nama;
    

    public Barang19(int kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }
    class TransaksiBarang {
        ArrayList<Barang19> barangs19;
        ArrayList<Barang19> pembelians19;
    
        public TransaksiBarang() {
            this.barangs19 = new ArrayList<>();
            this.pembelians19 = new ArrayList<>();
        }
    
        void TampilkanBarang(){
            System.out.println("Daftar Barang:");
            for (Barang19 arrayOfBarang : barangs19) {
            System.out.println("Kode: " + arrayOfBarang.kode + ", Nama: " + arrayOfBarang.nama + ", Harga: " + arrayOfBarang.harga + ", Stok: " + arrayOfBarang.stok);
            }
        }
        void tampilkanBarangPembelian() {
            System.out.println("Barang yang Dibeli:");
            for (Barang19 arrayOfPembelian : pembelians19) {
                System.out.println("Kode: " + arrayOfPembelian.kode + ", Nama: " + arrayOfPembelian.nama + ", Harga: " + arrayOfPembelian.harga);
            }
        }
        void lakukanPembelian(int kodeBarang) {
            for (Barang19 arrayOfBarang : barangs19) {
                if (arrayOfBarang.kode.equals(kodeBarang)) {
                    if (arrayOfBarang.stok > 0) {
                        arrayOfBarang.stok--;
                        pembelians19.add(new Barang19(arrayOfBarang.kode, arrayOfBarang.nama, arrayOfBarang.harga, 1));
                        System.out.println("Pembelian " + arrayOfBarang.nama + " berhasil dilakukan.");
                    } else {
                        System.out.println("Stok " + arrayOfBarang.nama + " tidak mencukupi.");
                    }
                    return;
                }
            }
            System.out.println("Barang tidak ditemukan.");
        }
    }
    
}        
