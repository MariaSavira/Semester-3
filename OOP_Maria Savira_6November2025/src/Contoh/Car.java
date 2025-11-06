package Contoh;

public class Car {
    private String brand; //menyimpan merek mobil
    private String model; //menyimpan model mobil
    private int year; //menyimpan tahun produksi

    public Car(String brand, String model, int year) {
        this.brand = brand; //digunakan untuk membedakan antara variabel class dan parameter
        this.model = model;
        this.year = year;
    }

    public String getCarInfo() { //mengembalikan mobil dgn lengkap dlm format string
        return brand + " " + model + " (" + year + ")";
    }
}
