package Tugas;

public class Buku {

    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean tersedia;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.tersedia = true;
    }

    public void tampilkanInfo() {
        System.out.println("Judul   : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Tahun   : " + tahunTerbit);
        System.out.println("Status  : " + (tersedia ? "Tersedia" : "Dipinjam"));
        System.out.println();
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
