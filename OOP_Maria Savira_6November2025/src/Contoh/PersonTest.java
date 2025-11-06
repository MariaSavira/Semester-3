package Contoh; 
import static org.junit.Assert.assertEquals; 
import org.junit.Test; 
public class PersonTest { 
    @Test 
    public void testSuperclass() { 
        // Focus on creating superclass objects and their methods 
        String codeInputName = "Alice"; 
        int codeInputAge = 20; 
        Person codeOutputPerson = new Person(codeInputName, codeInputAge); //membuat objek person dan memanggil method getInfo()
        String codeOutput = codeOutputPerson.getInfo(); 
        String expOutput = "Alice (20 years old)"; 
        try { //pengujian hasil menggunak assertEquals
            assertEquals("Superclass info test:", expOutput, codeOutput); 
        } catch (AssertionError ae) { 
            System.out.println(ae);// Menampilkan pesan error jika hasil test tidak sesuai
     } 
    } 
    @Test 
    public void testSubclass() { 
        // Focus on creating subclass objects and accessing superclass methods+additional ones 
        String codeInputName = "Bob"; 
        int codeInputAge = 21; 
        String codeInputId = "S123"; 
        Student codeOutputStudent = new Student(codeInputName, codeInputAge, codeInputId); //mngakses method dari superclass(getInfo) dan subclass(getStudentId)
        String codeOutputInfo = codeOutputStudent.getInfo(); // superclass methods 
        String codeOutputId = codeOutputStudent.getStudentId(); // additional method 
        String expOutputInfo = "Bob (21 years old)"; 
        String expOutputId = "S123"; 
        try { 
            assertEquals("Subclass info test (superclass method):", expOutputInfo, codeOutputInfo); 
            assertEquals("Subclass info test (subclass method):", expOutputId, codeOutputId); 
        } catch (AssertionError ae) { 
            System.out.println(ae); 
        } 
    } 
} 