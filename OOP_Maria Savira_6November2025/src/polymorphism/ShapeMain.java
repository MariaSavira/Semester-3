package polymorphism;

abstract class Shape {
    // Method abstrak yang harus diimplementasikan oleh setiap subclass
    public abstract double getArea();
}

// Subclass Circle yang meng-override method getArea() dari Shape
class Circle extends Shape {
    private double radius; // atribut untuk menyimpan jari-jari lingkaran

    // Constructor untuk menginisialisasi nilai radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementasi method getArea() khusus untuk lingkaran
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Rectangle yang juga meng-override method getArea()
class Rectangle extends Shape {
    private double width;  // atribut untuk lebar persegi panjang
    private double height; // atribut untuk tinggi persegi panjang

    // Constructor untuk menginisialisasi nilai width dan height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementasi method getArea() khusus untuk persegi panjang
    @Override
    public double getArea() {
        return width * height;
    }
}

// Class utama untuk menjalankan contoh polymorphism
public class ShapeMain {
    public static void main(String[] args) {
        // Membuat objek Circle dan Rectangle tetapi direferensikan sebagai Shape
        Shape circle = new Circle(1.0);        // bentuknya Shape, tapi objeknya Circle
        Shape rectangle = new Rectangle(2.0, 3.0); //  bentuknya Shape, tapi objeknya Rectangle

        // Menampilkan luas masing-masing bentuk
        System.out.println("Luas Lingkaran: " + circle.getArea());
        System.out.println("Luas Persegi Panjang: " + rectangle.getArea());
    }
}
