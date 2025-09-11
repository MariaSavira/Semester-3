public class Motor{
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    public String getPLatNomor(){
        return platNomor;    
    }

    public boolean isMesinOn(){
        return isMesinOn;    
    }

    public int getKecepatan(){
        return kecepatan;    
    }
    
    public void setIsMesinOn(boolean isMesinOn){
        this.isMesinOn = isMesinOn;    
    }

    public void setKecepatan(int kecepatan){
        if (!this.isMesinOn && kecepatan > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            if (kecepatan > 100){
                System.out.println("Maksimal kecepatan adalah 100!");
            } else if (kecepatan < 0){
                System.out.println("Kecepatan tidak boleh negatif!");
            } else {
                this.kecepatan = kecepatan;    
            }
        }
    }

    public void setPlatNomor(String platNomor){
        this.platNomor = platNomor;    
    }

    public void displayStatus(){
        System.out.println("Plat Nomor : " + this.platNomor);

        if (isMesinOn){
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan : " + this.kecepatan);
        System.out.println("============================");
    }
}
