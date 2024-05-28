import java.util.Scanner;
public class EkspedisiTugas2 {
    public int Nomor_paket, Ongkir;
    public String Nama_pelanggan, Nama_barang, Alamat;
    
}
    class Datapaket{
    

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
     

            EkspedisiTugas2[] arrayofDatapaket = new EkspedisiTugas2[3];

            for (int i = 0; i < 3; i++){
                arrayofDatapaket[i] = new EkspedisiTugas2();
    
                System.out.println("Paket ke-" + (i + 1));
                System.out.print("Masukkan Nama Anda : ");
                arrayofDatapaket[i].Nama_pelanggan = sc.next();
                System.out.print("Masukkan Nama Barang : ");
                arrayofDatapaket[i].Nama_barang = sc.next();
                System.out.print("Masukkan Nomor Paket : ");
                arrayofDatapaket[i].Nomor_paket = sc.nextInt();
                System.out.print("Masukkan Alamat : ");
                arrayofDatapaket[i].Alamat = sc.next();
            }

            for (int i = 0; i < 3; i++){
                System.out.println("Paket ke-" + (i + 1) + ", Nama : " + arrayofDatapaket[i].Nama_pelanggan + ", Nama Barang : " + arrayofDatapaket[i].Nama_barang 
                + ", Nomor Paket : " + arrayofDatapaket[i].Nomor_paket + ", Alamat : " + arrayofDatapaket[i].Alamat);
            }
        }
    }
    class PenghitunganBiaya {
        static int Express = 30000, Reguler = 10000, Kargo = 20000, biayaPengiriman;
        

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            EkspedisiTugas2[] arrayofPenghitunganBiaya = new EkspedisiTugas2[3];

            for (int i = 0; i < 3; i++){
                arrayofPenghitunganBiaya[i] = new EkspedisiTugas2();
                
                
                System.out.println("Paket ke-" + (i + 1));
                System.out.print("Masukkan Nomor Paket : ");
                arrayofPenghitunganBiaya[i].Nomor_paket = sc.nextInt();
                System.out.print("Pilih jenis pengiriman  (1. Express, 2. Reguler, 3. Kargo): ");
                arrayofPenghitunganBiaya[i].Ongkir = sc.nextInt();
                switch (arrayofPenghitunganBiaya[i].Ongkir) {
                case 1:
                    System.out.println("Harga Pengiriman Express : " + Express);
                    arrayofPenghitunganBiaya[i].Ongkir = biayaPengiriman + Express;
                    break;
                case 2:
                    System.out.println("Harga Pengiriman Reguler : " + Reguler);
                    arrayofPenghitunganBiaya[i].Ongkir = biayaPengiriman + Reguler;
                    break;
                case 3:
                    System.out.println("Harga Pengiriman Kargo : " + Kargo);
                    arrayofPenghitunganBiaya[i].Ongkir = biayaPengiriman + Kargo;
                    break;
                }
            }

            for (int i = 0; i < 3; i++){
                System.out.println("Paket ke-" + (i + 1) + ", Nomor Paket : " + arrayofPenghitunganBiaya[i].Nomor_paket + ", Ongkir : " + arrayofPenghitunganBiaya[i].Ongkir);
            }
        }
    }

