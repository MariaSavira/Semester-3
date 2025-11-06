package interfaceExample; 
import static org.junit.Assert.assertEquals; 
import org.junit.Test; 
public class PayableTest { 
    @Test //memeriksa metode getPaymentAmount() mengembalikan nilai yang benar
    public void testGetPaymentAmountCase1() { 
        // Code input 
        double codeInputSalary = 4500.0; 
        Employee employee = new Employee(codeInputSalary); 
        // Execution / code output 
        double codeOutput = employee.getPaymentAmount(); 
        // Expected output 
        double expectedOutput = 4500.0; 
        // Assertion 
        try { 
            assertEquals("getPaymentAmount() test case 1:", expectedOutput, codeOutput,0.0001); 
        } catch (AssertionError ae) { 
            System.out.println(ae); 
        } 
    } 
    @Test //memeriksa kasus lain dengan nilai gaji berbeda
    public void testGetPaymentAmountCase2() { 
        // Code input 
        double codeInputSalary = 3000.0; 
          Employee employee = new Employee(codeInputSalary); 
        // Execution / code output 
        double codeOutput = employee.getPaymentAmount(); 
        // Expected output 
        double expectedOutput = 3000.0; 
        // Assertion 
        try { 
            assertEquals("getPaymentAmount() test case 2:", expectedOutput, codeOutput, 
0.0001); 
        } catch (AssertionError ae) { 
            System.out.println(ae); 
        } 
    } 
} 
