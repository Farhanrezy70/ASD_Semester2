package UTS;

class Rekening19 {
    
    int noRekening;
    String nama;
    String namaIbu;
    String phone;
    String email;

    Rekening19(int noRekening, String nama, String namaIbu, String phone, String email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.phone = phone;
        this.email = email;
    }

    void TampilRek(){
        System.out.println("No Rekening = "+ noRekening);
        System.out.println("Nama = "+ nama);
        System.out.println("Nama Ibu = "+ namaIbu);
        System.out.println("No HP = "+ phone);
        System.out.println("Email = "+ email);
    }

}
        

