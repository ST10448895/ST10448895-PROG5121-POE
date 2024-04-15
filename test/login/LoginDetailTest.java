/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package login;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class LoginDetailTest {
    LoginDetail Username = new LoginDetail();
    LoginDetail Passwords = new LoginDetail();
     LoginDetail Succeed = new LoginDetail();
    
    public LoginDetailTest() {
    }

    @Test
    public void testStart() {
    }

    @Test
    public void testSetSuccess() {
    }

    @Test
    public void testGetSuccess() {
    }

    @Test
    public void testNAME() {
    }

    @Test
    public void testSurename() {
    }

    @Test
    public void testCheckUsername() {
      String expected = "Kyl_1";
      String actual = Username.Username1;
      assertEquals(expected,actual);
      
        
        
    }

    @Test
    public void testCheckPasswordComplexity() {
        String expected = "Ch&&sec@ke99!";
      String actual = Passwords.Password2;
      assertEquals(expected,actual);
      
    }

    @Test
    public void testRegisterUser() {
        
    }

    @Test
    public void testLoginUser() {
        assertTrue(Username.loginUser());
        assertTrue(Passwords.loginUser());
    }

    @Test
    public void testReturnLoginStatus() {
        String expected = "Login Successful";
        String actual = Succeed.Success;
        assertEquals(expected,actual);
    }
    
}
