import java.util.ArrayList;

public class KeranjangBelanja {
    private ArrayList<Produk> produk;

    public KeranjangBelanja() {
        this.produk = new ArrayList<Produk>();
    }

    public void tambahProduk(Produk p) {
        produk.add(p);
    }

    public int hitungTotalHarga() {
        int total = 0;
        for (Produk p : produk) {
            total += p.getHarga();
        }
        return total;
    }
}
