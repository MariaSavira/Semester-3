public class Produk{
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public static class Elektronik extends Produk{
        private int garansi;

        public Elektronik(String namaProduk, double harga, int stok, int garansi){
            super(namaProduk, harga, stok);
            this.garansi = garansi;
        }

        public int cekGaransi(){
            return garansi;
        }

        public static class Handphone extends Elektronik{
            private String sistemOperasi;

            public Handphone(String sistemOperasi, String namaProduk, double harga, int stok, int garansi) {
                super(namaProduk, harga, stok, garansi);
                this.sistemOperasi = sistemOperasi;
            }

            public void tampilInfo(){
                super.tampilInfo();
                System.out.println("Garansi : " + super.cekGaransi() + " bulan");
                System.out.println("Sistem Operasi : " + sistemOperasi);
                System.out.println();
            }
        }

        public static class Laptop extends Elektronik{
            private String prosesor;

            public Laptop(String prosesor, String namaProduk, double harga, int stok, int garansi) {
                super(namaProduk, harga, stok, garansi);
                this.prosesor = prosesor;
            }

            public void tampilInfo(){
                super.tampilInfo();
                System.out.println("Garansi : " + super.cekGaransi() + " bulan");
                System.out.println("Prosesor : " + prosesor);
                System.out.println();
            }
        }
    }

    public static class Pakaian extends Produk{
        private String ukuran;

        public Pakaian(String ukuran, String namaProduk, double harga, int stok) {
            super(namaProduk, harga, stok);
            this.ukuran = ukuran;
        }

        public void tampilInfo(){
            super.tampilInfo();
            System.out.println("Ukuran : " + cekUkuran());
        }

        public String cekUkuran(){
            return ukuran;
        }
    }

    public String getNamaProduk(){
        return namaProduk;
    }

    public double getHarga(){
        return harga;
    }

    public int getStok(){
        return stok;
    }

    public void tampilInfo(){
        System.out.println("Nama Produk : " + getNamaProduk());
        System.out.printf("Harga : %,.0f\n", getHarga());
        System.out.println("Stok : " + getStok());
    }
}