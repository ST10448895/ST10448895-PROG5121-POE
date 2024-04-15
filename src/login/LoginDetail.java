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
    public String Username1;
    
    public String Password2;
    public String Success;
   
    public  void start() {
        NAME();
      Surename();
       CheckUsername();
        CheckPasswordComplexity();
        
         loginUser();
         ReturnLoginStatus();
    
}
    public void setSuccess(String success){
     Success=success;
}
    public String getSuccess(){
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

    public  boolean CheckUsername() {
        
        JOptionPane.showMessageDialog(null, "create a username that contains an underscore and is longer than 5 characters");

         Username1 = JOptionPane.showInputDialog("Enter a username");

        boolean validUsername = false;//tracks if username meets criteria 

        while (!validUsername) {//loop ensures that the user keeps entering a username until it meets the required conditions
            if (Username1.length() < 5) {
                JOptionPane.showMessageDialog(null, "Username is to short. TRY AGAIN");
                Username1 = JOptionPane.showInputDialog("Enter your username");
            } else if (!Username1.contains("_")) {
                JOptionPane.showMessageDialog(null, "Username does not contain an underscore. TRY AGAIN");
                Username1 = JOptionPane.showInputDialog("Enter your username");
            } else {
                validUsername = true;//username has met all the conditions
            }
        }
        System.out.println(Username1);
        return true;
            
    }
    public  boolean CheckPasswordComplexity() {
        
        JOptionPane.showMessageDialog(null, "enter a password that contains capital letter, numbers, a symbol and is 8 characters long");
         Password2 = JOptionPane.showInputDialog("Enter a password");
        boolean validPassword = false;//tracks if password meets criteria 
        while (!validPassword) {// loop ensures that the user keeps entering a password until it meets the required conditions
            if (Password2.length() < 7) {
                JOptionPane.showMessageDialog(null, "Password is to short. TRY AGAIN");
                JOptionPane.showInputDialog("Enter a password");
            } else if (!Password2.matches(".*[A-Z].*")) {
                JOptionPane.showMessageDialog(null, " Password mucst contain at least one Capital letter. TRY AGAIN");
                JOptionPane.showInputDialog("Enter a password");
            } else if (!Password2.matches(".*[~!@#$%^&*={}].*")) {
                JOptionPane.showMessageDialog(null, " Password mucst contain at least one special character. TRY AGAIN");
                JOptionPane.showInputDialog("Enter a password");
            } else if (!Password2.matches(".*[0-9].*")) {
                JOptionPane.showMessageDialog(null, " Password mucst contain at least one number. TRY AGAIN");
                JOptionPane.showInputDialog("Enter a password");
            }else
            {
                validPassword = true;//password has met all conditions
            }

        }
        
        System.out.println(Password2);
        return true;
    }
   public  String RegisterUser(){
      if(CheckUsername())
          if(CheckPasswordComplexity())
              return"Username and Password conditions have been met";
      else
              return "Password does not meet all conditions";
      else
          return " username doesnt meet all conditions";
}
    public  Boolean loginUser(){
       
        String USER3= JOptionPane.showInputDialog("Enter your Username");
        String pasword3= JOptionPane.showInputDialog("Enter your password");
         U = USER3.equals(Username1);
         P =pasword3.equals(Password2);
         
            return true;
    }
    public  String ReturnLoginStatus(){
        
       if(U&&P)  {
            JOptionPane.showMessageDialog(null,"Login Successfull: Welcome"+'\n' + Name+ Surename);
           Success ="Login Successful";
           return Success;
       } else{  
           JOptionPane.showMessageDialog(null,"Login UnSuccessfull" );
            loginUser() ;
            ReturnLoginStatus();
            return "LOGIN unsuccessful, Password or Username is invalid";
            
       }    
    }
}
