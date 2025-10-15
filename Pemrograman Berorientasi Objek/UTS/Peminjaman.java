
public class Peminjaman {

    private Anggota anggota;
    private BahanPustaka bahan;
    private String tanggalPinjam;
    private String tanggalKembali;

    public Peminjaman(Anggota anggota, BahanPustaka bahan, String tanggalPinjam, String tanggalKembali) {
        this.anggota = anggota;
        this.bahan = bahan;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public BahanPustaka getBahan() {
        return bahan;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public int hitungDenda(int hariTerlambat) {
        return hariTerlambat * 1000;
    }

    public int hitungDenda(int hariTerlambat, int tarifPerHari) {
        return hariTerlambat * tarifPerHari;
    }

    public void tampilkanDetail() {
        System.out.println("=== Detail Peminjaman ===");
        System.out.println("Nama Anggota  : " + anggota.getNama());
        System.out.println("Email Anggota : " + anggota.getEmail());
        System.out.println("Bahan Pustaka : " + bahan.getJudul());
        System.out.println("Kode Pustaka  : " + bahan.getKode());
        System.out.println("Tanggal Pinjam: " + tanggalPinjam);
        System.out.println("Tanggal Kembali: " + tanggalKembali);

        if (bahan instanceof BahanPustaka.Buku) {
            BahanPustaka.Buku b = (BahanPustaka.Buku) bahan;
            System.out.println("Jenis         : Buku");
            System.out.println("Jumlah Halaman: " + b.getJumlahHalaman());
            System.out.println();
        } else if (bahan instanceof BahanPustaka.Majalah) {
            BahanPustaka.Majalah m = (BahanPustaka.Majalah) bahan;
            System.out.println("Jenis         : Majalah");
            System.out.println("Edisi         : " + m.getEdisi());
            System.out.println();
        }

        int denda1 = hitungDenda(3);
        int denda2 = hitungDenda(3, 2000);

        System.out.println("Denda (tarif default): Rp" + denda1);
        System.out.println("Denda (tarif custom) : Rp" + denda2);
        System.out.println();
    }
}
