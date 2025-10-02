public class MataKuliah{
    private String kodeMK;
    private String namaMK;
    private int sks;

    public MataKuliah(String kodeMK, String namaMK, int sks){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public String getKodeMK(){
        return kodeMK;
    }

    public String getNamaMK(){
        return namaMK;
    }

    public int getSKS(){
        return sks;
    }

    public void setKodeMK(String kodeMK){
        this.kodeMK = kodeMK;
    }

    public void setNamaMK(String namaMK){
        this.namaMK = namaMK;
    }

    public void setSKS(int sks){
        this.sks = sks;
    }
}