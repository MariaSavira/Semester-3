public class Produk {
    private String namaProduk;
    private int harga;

    public Produk(String namaProduk, int harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public static class BukuDigital extends Produk{
        private int jumlahHalaman;

        public BukuDigital(String namaProduk, int harga, int jumlahHalaman) {
            super(namaProduk, harga);
            this.jumlahHalaman = jumlahHalaman;
        }   

        public int getJumlahHalaman(){
            return jumlahHalaman;
        }

        public void setJumlahHalaman(int jumlahHalaman){
            this.jumlahHalaman = jumlahHalaman;
        }

        public void tampilInfoProduk(){
            System.out.println("Nama Produk : " + super.namaProduk);
            System.out.println("Harga : " + super.harga);
            System.out.println("Jumlah Halaman : " + getJumlahHalaman());
        }
    }

    public static class KursusOnline extends Produk{
        private int durasiVideo;

        public KursusOnline(String namaProduk, int harga, int durasiVideo) {
            super(namaProduk, harga);
            this.durasiVideo = durasiVideo;
        }

        public int getDurasiVideo(){
            return durasiVideo;
        }

        public void setDurasiVideo(int durasiVideo){
            this.durasiVideo = durasiVideo;
        }

        public void tampilInfoProduk(){
            System.out.println("Nama Produk : " + super.namaProduk);
            System.out.println("Harga : " + super.harga);
            System.out.println("Durasi Video : " + getDurasiVideo());
        }
    }

    public String getNamaProduk(){
        return namaProduk;
    }

    public int getHarga(){
        return harga;
    }

    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

}
