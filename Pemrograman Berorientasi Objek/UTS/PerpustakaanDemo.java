public class PerpustakaanDemo {
    
    public static void main(String[] args) {
        
        BahanPustaka.Buku buku1 = new BahanPustaka.Buku("Laskar Pelangi", "Andrea Hirata", "B001", 450);
        BahanPustaka.Buku buku2 = new BahanPustaka.Buku("Bumi Manusia", "Pramoedya Ananta Toer", "B002", 520);
        BahanPustaka.Majalah majalah1 = new BahanPustaka.Majalah("National Geographic", "Redaksi NG", "M001", 203);
        BahanPustaka.Majalah majalah2 = new BahanPustaka.Majalah("Tempo", "Redaksi Tempo", "M002", 45);

        
        Rak rakFiksi = new Rak("Rak Fiksi");
        Rak rakMajalah = new Rak("Rak Majalah");

        rakFiksi.tambahBahan(buku1);
        rakFiksi.tambahBahan(buku2);
        rakMajalah.tambahBahan(majalah1);
        rakMajalah.tambahBahan(majalah2);

        
        Anggota anggota1 = new Anggota("Maria Savira", "A001", "maria@mail.com");
        Anggota anggota2 = new Anggota("Rafi Setiawan", "A002", "rafi@mail.com");

        
        Peminjaman p1 = new Peminjaman(anggota1, buku1, "10-10-2025", "17-10-2025");
        Peminjaman p2 = new Peminjaman(anggota1, majalah2, "11-10-2025", "18-10-2025");
        Peminjaman p3 = new Peminjaman(anggota2, buku2, "09-10-2025", "16-10-2025");

        
        anggota1.tambahPeminjaman(p1);
        anggota1.tambahPeminjaman(p2);
        anggota2.tambahPeminjaman(p3);

        
        System.out.println("\n===== DAFTAR ANGGOTA =====");
        anggota1.tampilkanInfo();
        System.out.println();
        anggota2.tampilkanInfo();

        
        System.out.println("\n===== DETAIL PEMINJAMAN =====");
        p1.tampilkanDetail();
        p2.tampilkanDetail();
        p3.tampilkanDetail();

        
        System.out.println("\n===== ISI RAK =====");
        rakFiksi.tampilkanIsiRak();
        rakMajalah.tampilkanIsiRak();
    }
}

