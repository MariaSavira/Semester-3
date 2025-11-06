package Overloading;

public class Calculator {

    // Method pertama: menjumlahkan dua bilangan integer
    public int add(int a, int b) {
        // Mengembalikan hasil penjumlahan dua bilangan
        return a + b;
    }

    // Method kedua: menjumlahkan dua bilangan double
    public double add(double a, double b) {
        // Mengembalikan hasil penjumlahan dua bilangan pecahan
        return a + b;
    }

    // Method ketiga: menjumlahkan tiga bilangan integer
    public int add(int a, int b, int c) {
        // Mengembalikan hasil penjumlahan tiga bilangan
        return a + b + c;
    }
}
