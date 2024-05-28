package UTS;

public class Transaksi19 {
    double saldo;
    double saldoAwal;
    double saldoAkhir;
    String tglTransaksi;
    String type;

    Transaksi19(double saldo, double saldoAwal, double saldoAkhir, String tglTransaksi, String type){
        this.saldo = saldo;
        this.saldoAwal = saldoAwal;
        this.saldoAkhir = saldoAkhir;
        this.tglTransaksi = tglTransaksi;
        this.type = type;
    }

    void TampilTran(){
        System.out.println("Saldo = "+ saldo);
        System.out.println("Nama = "+ saldoAwal);
        System.out.println("Nama Ibu = "+ saldoAkhir);
        System.out.println("No HP = "+ tglTransaksi);
        System.out.println("Email = "+ email);
    }
}
