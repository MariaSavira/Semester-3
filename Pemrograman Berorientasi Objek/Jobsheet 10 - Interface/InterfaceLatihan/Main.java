package InterfaceLatihan;

public class Main {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("Kipas Tancap", 140000, "Pink", "Maspion");
        Kulkas kulkas = new Kulkas(2, 4000000, "Putih Gading", "Polytron");
        TV tv = new TV("Amoled", 50, 5000000, "Hitam", "LG");
        SmartFridge sf = new SmartFridge(50, 2, 6000000, "Silver", "Polytron");

        kipas.getInfo();
        kulkas.getInfo();
        tv.getInfo();
        sf.getInfo();   
    }
}
