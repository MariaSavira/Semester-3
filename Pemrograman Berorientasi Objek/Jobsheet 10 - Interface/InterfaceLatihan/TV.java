package InterfaceLatihan;

public class TV extends AlatElektronik implements Audible {
    private String jenisLayar;
    private int volume;

    public TV (String jenisLayar, int volume, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }

    public String getJenisLayar(){
        return jenisLayar;
    }

    public void setJenisLayar(String jenisLayar){
        this.jenisLayar = jenisLayar;
    }

    @Override
    public void naikkanVolume(int increment){
        volume += increment;
    }

    @Override
    public void turunkanVolume(int decrement){
        volume -= decrement;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Jenis Layar : " + jenisLayar);
        System.out.println("Volume : " + volume);
    }
}
