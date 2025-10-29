package Tugas;

public class Ewallet extends Pembayaran {
    private double saldo;

    public Ewallet(String idTransaksi, double jumlah, String nama, double saldo) {
        super(idTransaksi, jumlah, nama);
        this.saldo = saldo;
    }

    @Override
    public void prosesTransaksi() {
        System.out.println("\n--- Proses Transaksi E-Wallet ---");
        if (saldo >= getJumlah()) {
            saldo -= getJumlah();
            System.out.println("Transaksi berhasil!");
            System.out.println("Saldo tersisa : Rp" + saldo);
        } else {
            System.out.println("Transaksi gagal. Saldo tidak cukup!");
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Metode : E-Wallet");
        System.out.println("Saldo : Rp" + saldo);
    }
}
