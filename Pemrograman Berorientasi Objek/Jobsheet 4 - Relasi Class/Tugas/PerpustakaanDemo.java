package Tugas;

public class PerpustakaanDemo {

    public static void main(String[] args) {

        Pegawai p1 = new Pegawai("Sinta", "P001");

        Buku b1 = p1.inputBukuBaru("Laskar Pelangi", "Andrea Hirata", 2005);
        Buku b2 = p1.inputBukuBaru("Bumi Manusia", "Pramoedya Ananta Toer", 1980);

        b1.tampilkanInfo();
        b2.tampilkanInfo();

        Anggota a1 = new Anggota("Maria", "A101");

        a1.pinjamBuku(b1);
        a1.tampilkanBukuDipinjam();

        a1.pinjamBuku(b1);

        a1.kembalikanBuku(b1);
        a1.tampilkanBukuDipinjam();

        a1.pinjamBuku(b2);
        a1.tampilkanBukuDipinjam();
    }
}
