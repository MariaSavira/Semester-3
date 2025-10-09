package tugas;

class Penyanyi {
    String nama;
    String genre;
    int tahunDebut;

    public Penyanyi() {
    }

    public static class Lagu extends Penyanyi {
    String judulLagu;

        public Lagu() {
            super();
        }

        public Lagu(String nama, String genre, int tahunDebut, String judulLagu) {
            super(nama, genre, tahunDebut); 
            this.judulLagu = judulLagu;
        }
     
        @Override
        public void info() {
            System.out.println("=== Data Lagu ===");
            System.out.println("Penyanyi     : " + nama);
            System.out.println("Genre        : " + genre);
            System.out.println("Tahun Debut  : " + tahunDebut);
            System.out.println("Judul Lagu   : " + judulLagu);
        }
    }

    public Penyanyi(String nama, String genre, int tahunDebut) {
        this.nama = nama;
        this.genre = genre;
        this.tahunDebut = tahunDebut;
    }

    public void info() {
        System.out.println("=== Data Penyanyi ===");
        System.out.println("Nama         : " + nama);
        System.out.println("Genre        : " + genre);
        System.out.println("Tahun Debut  : " + tahunDebut);
    }
}