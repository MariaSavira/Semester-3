public class Mobil{
    private String merek = "Avanza";
    private int kecepatan;

    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }

    public String getMerek(){
        return merek;
    }

    public void tampilkanInfo(){
        System.out.println("Merk : " + getMerek());
        System.out.println("Kecepatan : " + kecepatan);
    }
}