import java.util.ArrayList;

public class KRS {
    private Mahasiswa mhs;
    private ArrayList<MataKuliah> mk;

    public KRS(Mahasiswa mhs) {
        this.mhs = mhs;
        this.mk = new ArrayList<>;
    }   

    public void addMK(MataKuliah mk){
        mk.add();
    }

    public void tampilKRS(ArrayList<MataKuliah> mk, Mahasiswa mhs){
        mhs.tampilMhs();

        for (MataKuliah m : mk) {
        System.out.println("========================");
        System.out.println("Kode Matkul : " + m.getKodeMK());
        System.out.println("Nama Matkul : " + m.getNamaMK());
        System.out.println("SKS : " + m.getSKS());
        }
    }
}
