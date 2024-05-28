package Jobsheet_6;

public class Hotel19 {
    String nama, kota;
    int harga;
    byte bintang;

    Hotel19(String n, String k, int h, byte b)
    {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampil()
    {
        System.out.println("Nama = "+ nama);
        System.out.println("Kota = "+ kota);
        System.out.println("Harga = "+ harga);
        System.out.println("Rating = "+ bintang);
    }

}