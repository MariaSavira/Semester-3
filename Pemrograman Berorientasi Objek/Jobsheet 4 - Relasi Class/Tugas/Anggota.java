package Tugas;

import java.util.ArrayList;

public class Anggota {

    private String nama;
    private String idAnggota;
    private ArrayList<Buku> bukuDipinjam;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
        this.bukuDipinjam = new ArrayList<>();
    }

    public void pinjamBuku(Buku b) {
        if (b.isTersedia()) {
            bukuDipinjam.add(b);
            b.setTersedia(false);
            System.out.println(nama + " berhasil meminjam buku \"" + b.getJudul() + "\"");
        } else {
            System.out.println("Buku \"" + b.getJudul() + "\" tidak tersedia.");
        }
    }

    public void kembalikanBuku(Buku b) {
        if (bukuDipinjam.contains(b)) {
            bukuDipinjam.remove(b);
            b.setTersedia(true);
            System.out.println(nama + " mengembalikan buku \"" + b.getJudul() + "\"");
        } else {
            System.out.println("Buku ini tidak dipinjam oleh " + nama);
        }
    }

    public void tampilkanBukuDipinjam() {
        System.out.println("Daftar buku yang dipinjam oleh " + nama + ":");
        if (bukuDipinjam.isEmpty()) {
            System.out.println("- Tidak ada buku yang sedang dipinjam");
        } else {
            for (Buku b : bukuDipinjam) {
                System.out.println("- " + b.getJudul() + " (" + b.getPenulis() + ")");
            }
        }
        System.out.println();
    }

    public String getNama() {
        return nama;
    }

    public String getIdAnggota() {
        return idAnggota;
    }
}
