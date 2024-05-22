/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login;
import login.TO_DO_LIST;
import javax.swing.JOptionPane;
/**
 *
 * @author lab_services_student
 */
public class Login {
 public static String Username1;
    public static String Password2;
    
    public static void main(String[] args) {
      LoginDetail login;
        login = getLogin();
       
}
    public static LoginDetail getLogin(){
        LoginDetail login = new LoginDetail();
    login.NAME();
        login.Surename();
        JOptionPane.showMessageDialog(null, "create a username that contains an underscore and is no longer than 5 characters");
        Username1 = JOptionPane.showInputDialog("Enter a username");
        login.setCheckUsername(Username1);
        login.CheckUsername();
        Password2 = JOptionPane.showInputDialog("Enter a password that is at least 8 characters long" + '\n' + "has a capital letter" + '\n' + "has a special character" + '\n' + " has at least one number");
        login.setCheckPasswordComplexity(Password2);
        login.CheckPasswordComplexity();
          String USER3 = JOptionPane.showInputDialog("Enter your Username");
        String pasword3 = JOptionPane.showInputDialog("Enter your password");
       

        login.loginUser(USER3,pasword3);
        login.ReturnLoginStatus();
    return login;    
    }
}
