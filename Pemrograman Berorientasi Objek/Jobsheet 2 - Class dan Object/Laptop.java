public class Laptop {
    public String merk;
    public double ukuranLayar;
    public String prosesor;
    public String warna;
    public double harga;
    public boolean status;
    public int temp = 0; 
    
    public boolean hidupkanLaptop(){
        return status = true;
    }

    public boolean matikanLaptop(){
        return status = false;
    }

    public int tambahVolume(int volume){
        return temp += volume;
    }

    public int kurangiVolume(int volume){
        return temp -= volume;
    }

    public void tampilkanInfo(){
        System.out.println("Merk         : " + merk);
        System.out.println("Ukuran Layar : " + ukuranLayar + " inch");
        System.out.println("Prosesor     : " + prosesor);
        System.out.println("Warna        : " + warna);
        System.out.println("Harga        : " + harga);
        System.out.println("Volume saat ini : " + temp);

        if (!status){
            System.out.println("Laptop sedang mati!");
        } else {
            System.out.println("Laptop hidup!");
        }
        System.out.println();
    }
}
