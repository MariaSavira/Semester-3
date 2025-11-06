package Contoh;

// Class Student adalah turunan (subclass) dari Person
public class Student extends Person {
    private String studentId; // Menyimpan ID mahasiswa

    // Constructor ini digunakan jika hanya ingin mengisi name dan age saja
    public Student(String name, int age) {
        super(name, age); // Memanggil constructor dari superclass (Person)
    }
    // Constructor ini digunakan jika ingin mengisi name, age, dan studentId
    public Student(String name, int age, String studentId) {
        super(name, age); // Memanggil constructor dari superclass (Person)
        this.studentId = studentId; // Menginisialisasi studentId
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // getInfo() diwarisi langsung dari Person, jadi tidak perlu ditulis lagi
}
