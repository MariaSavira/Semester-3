public class DemoMarketplace {
    public static void main(String[] args) {
        Produk.BukuDigital buku = new Produk.BukuDigital("Basis Data Lanjut", 100000, 100);
        Produk.KursusOnline kursus = new Produk.KursusOnline("Kursus Basis Data", 100000, 60);

        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(kursus);

        buku.tampilInfoProduk();   
        kursus.tampilInfoProduk();   
        System.out.println("Total harga: " + keranjang.hitungTotalHarga());
    }
}
