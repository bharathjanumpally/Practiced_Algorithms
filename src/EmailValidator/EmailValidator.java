/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmailValidator;

/**
 *
 * @author bharath
 */
public class EmailValidator {
    
     public static void main(String[] args) {
        try {
            String mydomain = "java$hungry@blogspot.com";
            String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
            Boolean b = mydomain.matches(emailregex);
            
            if (b == false) {
                System.out.println("Email Address is Invalid");
                }else if(b == true){
                System.out.println("Email Address is Valid");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    
}
