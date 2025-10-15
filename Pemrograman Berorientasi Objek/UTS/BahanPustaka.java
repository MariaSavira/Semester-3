public class BahanPustaka {
    private String judul;
    private String pengarang;
    private String kode;

    public BahanPustaka(String judul, String pengarang, String kode) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.kode = kode;
    }

    public void tampilkanInfo() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Kode : " + kode);
    }

    public String getJudul() {
        return judul; 
    }

    public String getPengarang() {
        return pengarang; 
    }

    public String getKode() {
        return kode; 
    }

    
    public static class Buku extends BahanPustaka {
        private int jumlahHalaman;

        public Buku(String judul, String pengarang, String kode, int jumlahHalaman) {
            super(judul, pengarang, kode);
            this.jumlahHalaman = jumlahHalaman;
        }

        public int getJumlahHalaman() { 
            return jumlahHalaman;
        }

        @Override
        public void tampilkanInfo() {
            super.tampilkanInfo();
            System.out.println("Jumlah Halaman : " + jumlahHalaman);
        }
    }

    
    public static class Majalah extends BahanPustaka {
        private int edisi;

        public Majalah(String judul, String pengarang, String kode, int edisi) {
            super(judul, pengarang, kode);
            this.edisi = edisi;
        }

        public int getEdisi() { return edisi; }

        @Override
        public void tampilkanInfo() {
            super.tampilkanInfo();
            System.out.println("Edisi : " + edisi);
        }
    }
}
