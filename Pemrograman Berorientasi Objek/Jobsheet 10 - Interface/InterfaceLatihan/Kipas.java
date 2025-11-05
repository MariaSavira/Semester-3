package InterfaceLatihan;

public class Kipas extends AlatElektronik {
    private String jenis;

    public Kipas (String jenis, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.jenis = jenis;
    }

    public String getJenis(){
        return jenis;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Jenis : " + jenis);
    }
}