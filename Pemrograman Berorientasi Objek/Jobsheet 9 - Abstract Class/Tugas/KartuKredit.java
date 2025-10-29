package Tugas;

public class KartuKredit extends Pembayaran{
    private double limitKredit;
    private double sisaLimit;

    public KartuKredit(String idTransaksi, double jumlah, String nama, double limitKredit, double sisaLimit) {
        super(idTransaksi, jumlah, nama);
        this.limitKredit = limitKredit;
        this.sisaLimit = sisaLimit;
    }

    @Override
    public void prosesTransaksi() {
        System.out.println("\n--- Proses Transaksi Kartu Kredit ---");
        if (sisaLimit >= getJumlah()) {
            sisaLimit -= getJumlah();
            System.out.println("Transaksi berhasil!");
            System.out.println("Sisa limit : Rp" + sisaLimit);
        } else {
            System.out.println("Transaksi gagal. Limit tidak mencukupi!");
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Metode : Kartu Kredit");
        System.out.println("Limit Kredit : Rp" + limitKredit);
        System.out.println("Sisa Limit : Rp" + sisaLimit);
    }
}
