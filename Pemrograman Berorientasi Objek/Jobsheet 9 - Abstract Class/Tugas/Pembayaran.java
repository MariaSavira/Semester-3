package Tugas;

public abstract class Pembayaran {
    private String idTransaksi;
    private double jumlah;
    private String nama;

    public Pembayaran(String idTransaksi, double jumlah, String nama) {
        this.idTransaksi = idTransaksi;
        this.jumlah = jumlah;
        this.nama = nama;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public double getJumlah() {
        return jumlah;
    }

    public String getNama() {
        return nama;
    }

    public void tampilkanInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Jumlah : Rp" + jumlah);
    }

    public abstract void prosesTransaksi();
}
