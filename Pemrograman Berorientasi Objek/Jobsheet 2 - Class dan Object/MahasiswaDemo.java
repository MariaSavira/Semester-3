public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        m1.displayBiodata();
        
        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "12345";
        m2.nama = "Maria Savira";
        m2.alamat = "Pakis, Malang";
        m2.kelas = "2C";

        m2.displayBiodata();

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "098765";
        m3.nama = "Nurul Asri";
        m3.alamat = "Jakarta Selatan";
        m3.kelas = "2A";

        m3.displayBiodata();
    }
}
