
package javaappc;

import java.util.*;
import java.util.regex.*;

public class Account {
    
          
    
        public static void Accounts(){
           
            ArrayList<Integer> arr_id = new ArrayList<Integer>();
            ArrayList<String> arr_email = new ArrayList<String>();
            ArrayList<String> arr_usern = new ArrayList<String>();
           
            Accounts[] acc = new Accounts[100];
            Scanner sr = new Scanner(System.in);
            
            
            int ID = 0, num;
            String fname, lname, email = null, usern = null, pass = null;
            
            
            
            System.out.print("Enter the Number of Accounts: ");
            num = sr.nextInt();
            
            for (int i = 0; i < num; i++) {
                
                    acc[i] = new Accounts();
                    System.out.println("Account Details "+(i+1)+": ");
                
                   

          
                
                    
                    System.out.print("ID: ");
                    ID = sr.nextInt();
                    
                    while (arr_id.contains(ID)) {
                        System.out.print("\tID Already existed, Enter Again: ");
                        ID = sr.nextInt();
                    } 
                        arr_id.add(ID);
                       
                      
                
                
              
                
                System.out.print("First Name: ");
                fname = sr.next();
                
                System.out.print("Last Name: ");
                lname = sr.next();
                
              
                    System.out.print("Email: ");
                    email = sr.next();
                
                    while(arr_email.contains(email)){
                        System.out.print("\tEMAIL Already existed, Enter Again: ");
                        email = sr.next();
                    }
                        arr_email.add(email);
                      
               
                
                
                
              
                    System.out.print("Username: ");
                    usern = sr.next();
                    
                    while(arr_usern.contains(usern)){
                        System.out.print("\tUsername Already existed, Enter Again: ");
                        usern = sr.next();
                    }
                        arr_usern.add(usern);
                       
              
               
                  
                    
                
                    do {
                System.out.print("Password: ");
                pass = sr.next();
                  } while (!isValidPassword(pass));
                     
                     
                System.out.println("");
                
                
                acc[i].addAccounts(ID, fname, lname, email, usern, pass);
                
            }
            
            System.out.printf("| %-10s | %-10s | %-10s | %-30s | %-10s | %-15s | \n", "ID", "First Name", "Last Name", "Email", "Usernmame", "Password" );
            
            for (int i = 0; i < num; i++) {
                acc[i].viewAccounts();
            }
        }
        
        
            public static boolean isValidPassword(String password) {

                if (password.length() < 8) {
                    System.out.println("Password must be at least 8 characters long.");
                    return false;
                }


                if (!password.matches(".*[A-Z].*")) {
                    System.out.println("Password must contain at least one uppercase letter.");
                    return false;
                }
                if (!password.matches(".*[a-z].*")) {
                    System.out.println("Password must contain at least one lowercase letter.");
                    return false;
                }


                if (!password.matches(".*\\d.*")) {
                    System.out.println("Password must contain at least one digit.");
                    return false;
                }


                if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
                    System.out.println("Password must contain at least one special character.");
                    return false;
                }


                String[] commonPasswords = {"admin", "password", "1234"};
                for (String common : commonPasswords) {
                    if (password.toLowerCase().contains(common)) {
                        System.out.println("\tPassword must not contain common words like 'admin', 'password', or '1234'.");
                        return false;
                    }
                }


                return true;
            }
        
        
}
        