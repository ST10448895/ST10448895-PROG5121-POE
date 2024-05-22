/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class LoginDetail {

    String Name;
    String Surename;
    Boolean U;
    Boolean P;
    public static String Username1;

    public static String Password2;
    public String Success;
    public String USER3, Password3;

    public void start() {
        NAME();
        Surename();
        JOptionPane.showMessageDialog(null, "create a username that contains an underscore and is no longer than 5 characters");
        Username1 = JOptionPane.showInputDialog("Enter a username");
        CheckUsername();
        Password2 = JOptionPane.showInputDialog("Enter a password that is at least 8 characters long" + '\n' + "has a capital letter" + '\n' + "has a special character" + '\n' + " has at least one number");
        CheckPasswordComplexity();

        loginUser(Username1,Password2);
        ReturnLoginStatus();

    }

    public void setSuccess(String success) {
        Success = success;
    }

    public String getSuccess() {
        return Success;
    }

    public String NAME() {

        Name = JOptionPane.showInputDialog("Enter your first Name");

        JOptionPane.showMessageDialog(null, "Your name is: " + Name);
        //dont forget get name for success message

        return Name;
    }

    public String Surename() {

        Surename = JOptionPane.showInputDialog("Enter your last Name");

        JOptionPane.showMessageDialog(null, "Your name is: " + Surename);

        return Surename;
    }

    public void setCheckUsername(String USERS1) {
        Username1 = USERS1;
    }

    public boolean CheckUsername() {

        // JOptionPane.showMessageDialog(null, "create a username that contains an underscore and is no longer than 5 characters");
        //Username1 = JOptionPane.showInputDialog("Enter a username");
        boolean validUsername = false;//tracks if username meets criteria 

        while (!validUsername) {//loop ensures that the user keeps entering a username until it meets the required conditions
            validUsername = true;//username has met all the conditions
            if (Username1.length() >= 6) {
                JOptionPane.showMessageDialog(null, "Username is to Long. TRY AGAIN");
                Username1 = JOptionPane.showInputDialog("Enter your username");
            } else if (!Username1.contains("_")) {
                JOptionPane.showMessageDialog(null, "Username does not contain an underscore. TRY AGAIN");
                Username1 = JOptionPane.showInputDialog("Enter your username");
            }
        }
        System.out.println(Username1);
        return true;

    }

    public void setCheckPasswordComplexity(String Password_User2) {
        Password2 = Password_User2;
    }

    public boolean CheckPasswordComplexity() {
        boolean valid_password = false;
        while (!valid_password) {
            boolean hasNumber = false;
            boolean hasSpecialChar = false;
            boolean hasCapitalLetter = false;
            //Password2 = JOptionPane.showInputDialog("Enter a password that is at least 8 characters long"+'\n'+"has a capital letter"+'\n'+"has a special character"+'\n'+" has at least one number");

            if (Password2.length() < 8) {
                JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long");
                continue;//Skips the rest of the loop and goes back to the beginning of the while loop.
            }

            for (char c : Password2.toCharArray()) {//Starts a for-each loop that iterates over each character in the password
                if (Character.isDigit(c)) {
                    hasNumber = true;
                } else if (!Character.isLetterOrDigit(c)) {//Checks if the current character is a special character).
                    hasSpecialChar = true;
                } else if (Character.isUpperCase(c)) {
                    hasCapitalLetter = true;
                }
            }

            if (!hasNumber) {//Checks if no digit was found in the password
                JOptionPane.showMessageDialog(null, "Password must contain at least one number.TRY AGAIN");
            } else if (!hasSpecialChar) {
                JOptionPane.showMessageDialog(null, "Password must contain at least one special character.TRY AGAIN");
            } else if (!hasCapitalLetter) {
                JOptionPane.showMessageDialog(null, "Password must contain at least one capital letter. TRY AGAIN");
            } else {
                valid_password = true;

            }
        }
        System.out.println(Password2);
        return true;
    }

    public String RegisterUser() {
        if (CheckUsername()) {
            if (CheckPasswordComplexity()) {
                return "Username and Password conditions have been met";
            } else {
                return "Password does not meet all conditions";
            }
        } else {
            return " username doesnt meet all conditions";
        }
    }

    public Boolean loginUser(String USER3, String Password3) {

        U = USER3.equals(Username1);
        P = Password3.equals(Password2);

        return true;
    }

    public String ReturnLoginStatus() {

        if (U && P) {

            System.out.println("Login Successfull: Welcome" + '\n' + Name + Surename);
            Success = "Login Successful";
            return Success;
        } else {
           

            return "LOGIN unsuccessful, Password or Username is invalid";

        }
    }
}
