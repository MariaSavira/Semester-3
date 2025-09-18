package Tugas;

public class Pegawai {

    private String namaPegawai;
    private String idPegawai;

    public Pegawai(String namaPegawai, String idPegawai) {
        this.namaPegawai = namaPegawai;
        this.idPegawai = idPegawai;
    }

    public Buku inputBukuBaru(String judul, String penulis, int tahunTerbit) {
        System.out.println("Pegawai " + namaPegawai + " menambahkan buku baru: " + judul);
        return new Buku(judul, penulis, tahunTerbit);
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public String getIdPegawai() {
        return idPegawai;
    }
}
