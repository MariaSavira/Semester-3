package interfaceExample;

interface Payable { //untuk menentukan kontrak bahwa setiap class yang mengimplementasikannya harus memiliki method getPaymentAmount()
    double getPaymentAmount(); // Method abstrak, belum ada implementasinya
}

public class Employee implements Payable { //Employee wajib membuat implementasi dari method getPaymentAmount()
    private double salary; // Atribut untuk menyimpan gaji karyawan

    // Constructor untuk menginisialisasi nilai gaji
    public Employee(double salary) {
        this.salary = salary;
    }
    
    @Override
    public double getPaymentAmount() { // Mengembalikan nilai gaji yang sudah disimpan
        return salary;
    }

    public void displayPaymentInfo() { // Method tambahan (opsional) untuk menampilkan info pembayaran
        System.out.println("Total pembayaran karyawan: " + getPaymentAmount());
    }

    // Main method untuk menjalankan contoh program i
    public static void main(String[] args) {
        // Membuat objek Employee dengan gaji tertentu
        Employee employee1 = new Employee(4500.0);
        Employee employee2 = new Employee(3000.0);

        // Menampilkan hasil dari pemanggilan getPaymentAmount()
        System.out.println("Gaji Employee 1: " + employee1.getPaymentAmount());
        System.out.println("Gaji Employee 2: " + employee2.getPaymentAmount());
    }
}
