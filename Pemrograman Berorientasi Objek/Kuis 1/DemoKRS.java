public class DemoKRS {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("1234", "Maria", "SIB 2C");
        MataKuliah mk1 = new MataKuliah("BDL", "Basis Data Lanjut", 3);
        MataKuliah mk2 = new MataKuliah("PBO", "Pemrograman Berbasis Objek", 3);
        MataKuliah mk3 = new MataKuliah("PW", "Pemrograman Web", 3);

        KRS krs = new KRS(mhs);
        krs.tampilKRS(mhs);
    }   
}
