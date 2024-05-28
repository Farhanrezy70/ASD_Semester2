package Jobsheet_6;

public class Mainhotel19 {
    public static void main(String[] args) {
       Hotelservice19 list = new Hotelservice19();
       Hotel19 m1 = new Hotel19("Savana", "Malang", 25000, (byte)5);
       Hotel19 m5 = new Hotel19("Moon", "Batu", 26000, (byte)3);
       Hotel19 m2 = new Hotel19("Starshotel", "Surabaya", 19000, (byte)4);
       Hotel19 m3 = new Hotel19("Radho", "Kediri", 20000, (byte)1);
       Hotel19 m4 = new Hotel19("Alimar", "Malang", 22000, (byte)2);

       list.tambah(m1);
       list.tambah(m2);
       list.tambah(m3);
       list.tambah(m4);
       list.tambah(m5);

       System.out.println("Data hotel = ");
       list.tampilAll();

       System.out.println("Data hotel dengan filter harga termurah = ");
       list.bubbleSort();
       list.tampilAll();

       System.out.println("Data hotel dengan filter bintang tertinggi");
       list.selectionSort();
       list. tampilAll();

   }
}