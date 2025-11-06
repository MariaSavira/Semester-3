package Contoh;

public class Person {
    // Atribut bersifat private agar tidak dapat diakses langsung dari luar class (penerapan encapsulation)
    private String name;
    private int age;

    // Constructor digunakan untuk menginisialisasi (memberi nilai awal) atribut name dan age
    public Person(String name, int age) {
        this.name = name; // Mengisi atribut name dengan nilai dari parameter name
        this.age = age;   // Mengisi atribut age dengan nilai dari parameter age
    }

    // Getter digunakan untuk mengambil nilai atribut name
    public String getName() {
        return name;
    }

    // Setter digunakan untuk mengubah nilai atribut name
    public void setName(String name) {
        this.name = name;
    }

    // Getter digunakan untuk mengambil nilai atribut age
    public int getAge() {
        return age;
    }

    // Setter digunakan untuk mengubah nilai atribut age
    public void setAge(int age) {
        this.age = age;
    }

    // Method getInfo() digunakan untuk menampilkan informasi lengkap tentang objek Person
    public String getInfo() {
        // Mengembalikan string dengan format "Nama (Usia years old)"
        return name + " (" + age + " years old)";
    }
}
