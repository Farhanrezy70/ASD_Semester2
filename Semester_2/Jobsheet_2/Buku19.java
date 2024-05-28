public class Buku19 {
    String judul, pengarang;
        int halaman, stok, harga;
        double hargatotal, diskon;

        public Buku19() {

        }

        public Buku19(String jud, String pg, int hal, int stok, int har) {
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
        }

        void tampilInformasi(){
            System.out.println("Judul: " + judul);
            System.out.println("Pengarang: " + pengarang);
            System.out.println("Jumlah halaman:" + halaman);
            System.out.println("Sisa stok: "+ stok);
            System.out.println("Harga: "+ harga);
        }
        void terjual(int jml){
            if(stok > 0){
                stok -= jml;
            }
            stok -= jml;
        }
        void restock(int jml){
            stok+=jml;
        }
        void gantiHarga(int hrg){
            harga = hrg;
        }
        void Hitunghargatotal(int jml){
            hargatotal = harga * jml;
        }
        void HargaDiskon(){
            if (hargatotal > 150000){
                diskon = hargatotal * 0.12;
            }else if (hargatotal >= 75000 && hargatotal <= 150000) {
                diskon = hargatotal * 0.05;
            }
        }
        double hargabayar;
        void hitungHargabayar(){
            hargabayar = hargatotal - diskon;
        }
}
    