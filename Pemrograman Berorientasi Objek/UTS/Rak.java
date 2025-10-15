import java.util.ArrayList;

public class Rak {
    private String kategori;
    private ArrayList<BahanPustaka> daftarBahan;

    public Rak(String kategori) {
        this.kategori = kategori;
        this.daftarBahan = new ArrayList<BahanPustaka>();
    }

    public void tambahBahan(BahanPustaka b) {
        daftarBahan.add(b);
    }

    public void tampilkanIsiRak() {
        System.out.println();
        System.out.println("Rak Kategori: " + kategori);
        for (int i = 0; i < daftarBahan.size(); i++) {
            BahanPustaka b = daftarBahan.get(i);
            System.out.println((i + 1) + ". " + b.getJudul() + " (" + b.getPengarang() + ")");
        }
    }

    public String getKategori() {
        return kategori;
    }

    public ArrayList<BahanPustaka> getDaftarBahan() {
        return daftarBahan;
    }
}
