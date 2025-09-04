public class PersegiPanjang{
    public int panjang;
    public int lebar;

    public int getLuas(){
        return panjang * lebar;
    }

    public int getKeliling(){
        return 2 * (panjang + lebar);
    }
    
    public void displayInfo(){
        System.out.println("Panjang  : " + panjang);
        System.out.println("Lebar    : " + lebar);
        System.out.println("Luas     : " + getLuas());
        System.out.println("Keliling : " + getKeliling() + "\n");
    }
}
