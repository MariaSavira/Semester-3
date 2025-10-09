package inheritance;
import testpackage.Pegawai;

public class Dosen extends Pegawai {
    
    public String nidn;
    public String jurusan;

    public Dosen(String nip, String nama, double gaji, String nidn, String jurusan) {
        super(nip, nama, gaji);
        this.nidn = nidn;
        this.jurusan = jurusan;
    }

    public String getInfo() {
        String hasil = "";
        hasil += "NIDN : " + this.nidn + "\n";
        hasil += "Jurusan : " + this.jurusan + "\n";

        return hasil;
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += getInfo();

        return info;
    }
}
