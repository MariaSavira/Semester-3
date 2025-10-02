package inheritance;

public class PegawaiDemo {
    public static void main(String[] args) {
        Dosen dosen2 = new Dosen("34329837", "Yansy Ayuningtyas", 3000000, "1989432439", "Akuntansi");
        Dosen dosen3 = new Dosen("12345678", "Bu Laras", 3000000, "0987654321", "Teknologi Informasi");

        // dosen1.nama = "Yansy Ayuningtyas";
        // dosen1.nip = "34329837";
        // dosen1.gaji = 3000000;
        // dosen1.nidn = "1989432439";

        System.out.println(dosen2.getAllInfo());
        System.out.println(dosen3.getAllInfo());
    }
}