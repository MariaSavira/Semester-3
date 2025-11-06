package Overriding;

public class CalculatorOverriding {

    // Method getType() akan mengembalikan tipe kalkulator
    public String getType() {
        // Mengembalikan teks default untuk kalkulator umum
        return "Generic Calculator";
    }

    // Method divide() digunakan untuk membagi dua bilangan
    public double divide(double a, double b) {
        // Jika penyebut 0, maka hasil pembagian tidak terdefinisi (NaN)
        if (b == 0) {
            return Double.NaN;
        }
        return a / b;
    }

    public static class ScientificCalculator extends CalculatorOverriding {  // Inner subclass yang menimpa (override) method superclass

        // Override method getType() agar menampilkan tipe kalkulator ilmiah
        @Override
        public String getType() {
            return "Scientific Calculator";
        }

        // Override method divide() untuk menangani pembagian dengan nol secara ilmiah
        @Override
        public double divide(double a, double b) {
            // Dalam kalkulator ilmiah, pembagian dengan 0 dianggap menghasilkan ∞
            if (b == 0) {
                return Double.POSITIVE_INFINITY;
            }
            return a / b;
        }
    }
}
