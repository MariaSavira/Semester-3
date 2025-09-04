public class LaptopDemo {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.merk = "Asus";
        l1.ukuranLayar = 15.6;
        l1.prosesor = "Intel Core i7";
        l1.warna = "Putih";
        l1.harga = 8000000; 

        l1.hidupkanLaptop();
        l1.tambahVolume(50);
        l1.tampilkanInfo();
        
        Laptop l2 = new Laptop();
        l2.merk = "Lenovo";
        l2.ukuranLayar = 12;
        l2.prosesor = "Ryzen 5";
        l2.warna = "Midnight blue";
        l2.harga = 9000000; 

        l2.hidupkanLaptop();
        l2.tambahVolume(23);
        l2.kurangiVolume(3);
        l2.tampilkanInfo();

        l2.harga += 500000;
        l2.matikanLaptop();
        l2.tampilkanInfo();
    }
}
