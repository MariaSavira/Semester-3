
public class Anggota {

    private String nomorKTP;
    private String nama;
    private int limitPinjaman = 5000000;
    private int jumlahPinjaman = 0;

    public Anggota(String nomorKTP, String nama, int jumlahPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public void pinjam(int temp) {
        if (temp > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += temp;
        }
    }

    public int angsur(int temp) {
        return jumlahPinjaman -= temp;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }
}
