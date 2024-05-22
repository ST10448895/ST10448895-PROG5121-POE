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
    LoginDetail S = new LoginDetail();
    String actual, result;
     LoginDetail login = new LoginDetail();

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
        boolean expected = true;
        String User ="Kyl_1";
        Username.Username1 = User;
        boolean actual = Username.CheckUsername();
        //assertTrue(actual);
        assertEquals(expected, actual);

    }

    @Test
    public void testCheckPasswordComplexity() {
       boolean expected = true;
        String Pass ="Password1@";
        Passwords.Password2 = Pass;
        boolean actual = Passwords.CheckPasswordComplexity();
        //assertTrue(actual);
        System.out.println("Password successfully captured");
        assertEquals(expected, actual);
        

    }

    @Test
    public void testRegisterUser() {

    }

    @Test
    public void testLoginUser() {
        String USER3 = "Kyl_1";
        String pasword3 = "Password1@";
        
        assertTrue(Username.loginUser(USER3,pasword3));
        assertTrue(Passwords.loginUser(USER3,pasword3));
    }

    @Test
    public void testReturnLoginStatus() {
         login.Name = "Wandile ";
        login.Surename = " Zuke";
      if(  login.U =true  ){
          if (login.P = true){
         result = login.ReturnLoginStatus();}}
        assertEquals("Login Successful", result);
    }
   

}
