public class ProdukDemo{
    public static void main(String[] args) {
        Produk.Elektronik.Handphone iphone = new Produk.Elektronik.Handphone
        ("IOS 100", "IPhone 20 Pertamax", 10000000, 1, 12);

        Produk.Elektronik.Laptop asus = new Produk.Elektronik.Laptop
        ("Intel i9", "Asus Vivobook 100", 12000000, 5, 24);

        Produk.Pakaian vneck = new Produk.Pakaian("M", "V-Neck Tshirt", 250000, 15);

        iphone.tampilInfo();
        asus.tampilInfo();
        vneck.tampilInfo();
    }
}