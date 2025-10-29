package Tugas;

public class PembayaranMain {
    public static void main(String[] args) {
        Ewallet e1 = new Ewallet("TRX001", 50000, "Maria Savira", 120000);
        KartuKredit k1 = new KartuKredit("TRX002", 150000, "Maria Savira", 1000000, 400000);

        System.out.println("=== INFORMASI E-WALLET ===");
        e1.tampilkanInfo();
        e1.prosesTransaksi();

        System.out.println("\n=== INFORMASI KARTU KREDIT ===");
        k1.tampilkanInfo();
        k1.prosesTransaksi();
    }
}
