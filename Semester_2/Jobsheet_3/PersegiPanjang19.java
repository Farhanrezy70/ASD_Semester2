import java.util.Scanner;
public class PersegiPanjang19 {
    public int panjang;
    public int lebar;

    public PersegiPanjang19(int p, int l){
        panjang = p;
        lebar = l;
    }
}

    class PersegiPanjangDemo19 {
        

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang19[] arrayOfPersegiPanjang = new PersegiPanjang19[3];
        int panjang,lebar;

        for (int i = 0; i < 3; i++){    
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang : ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang19(panjang, lebar);
        }
    
        for (int i = 0; i < 3; i++){
            System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang : " + arrayOfPersegiPanjang[i].panjang + ", lebar : " + arrayOfPersegiPanjang[i].lebar);
        }
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("=====================");
    System.out.println("Toko Maju Mundur Cantik :");
    System.out.println("1. Tampilkan Barang ");
    System.out.println("2. Beli");
    System.out.println("3. Tampilkan Pembelian");
    System.out.println("4. Keluar");
    System.out.println("Pilih Menu : ");
    int menu = sc.nextInt();

    switch (menu){
        case 1:
    }