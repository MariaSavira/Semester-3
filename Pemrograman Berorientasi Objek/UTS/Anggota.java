import java.util.ArrayList;

public class Anggota {

    private String nama;
    private String idAnggota;
    private String email;
    private ArrayList<Peminjaman> peminjaman;

    public Anggota(String nama, String idAnggota, String email) {
        this.nama = nama;
        this.idAnggota = idAnggota;
        this.email = email;
        this.peminjaman = new ArrayList<Peminjaman>();
    }

    public void tambahPeminjaman(Peminjaman p) {
        peminjaman.add(p);
    }

    public String getNama(){
        return nama;
    }    

    public String getEmail(){
        return email;
    }

    public void tampilkanInfo() {
        System.out.println("ID : " + idAnggota);
        System.out.println("Nama : " + nama);
        System.out.println("Email : " + email);
        System.out.println("Buku yang dipinjam : ");
        for (int i = 0; i < peminjaman.size(); i++) {
            Peminjaman p = peminjaman.get(i);
            System.out.println((i + 1) + ". " + p.getBahan().getJudul());
            System.out.println("Pengarang : " + p.getBahan().getPengarang());
            System.out.println("Kode Pustaka : " + p.getBahan().getKode());

            if (p.getBahan() instanceof BahanPustaka.Buku) {
                BahanPustaka.Buku b = (BahanPustaka.Buku) p.getBahan();
                System.out.println("Jumlah halaman : " + b.getJumlahHalaman());

            } else if (p.getBahan() instanceof BahanPustaka.Majalah) {
                BahanPustaka.Majalah b = (BahanPustaka.Majalah) p.getBahan();
                System.out.println("Edisi : " + b.getEdisi());
            }
        }
    }
}
