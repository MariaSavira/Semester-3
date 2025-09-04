public class DemoPersegi {
    public static void main(String[] args) {
        PersegiPanjang p1 = new PersegiPanjang();
        p1.panjang = 10;
        p1.lebar = 5;

        p1.displayInfo();

        PersegiPanjang p2 = new PersegiPanjang();
        p2.panjang = 35;
        p2.lebar = 2;

        p2.displayInfo();
    }
}
