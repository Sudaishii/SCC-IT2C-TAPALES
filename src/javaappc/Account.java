
package javaappc;

import java.util.*;

public class Account {
    
        public static void Accounts(){
            
           
            Accounts[] acc = new Accounts[100];
            Scanner sr = new Scanner(System.in);
            
            
            int ID = 0, num;
            String fname, lname, email, usern, pass;
            
            boolean yw = true;
            
            System.out.print("Enter the Number of Accounts: ");
            num = sr.nextInt();
            
            for (int i = 0; i < num; i++) {
                
                    acc[i] = new Accounts();
                    System.out.println("Account Details "+(i+1)+": ");
                
                    System.out.print("ID: ");
                    while(yw){
                       
                        boolean found = false;

                        
                        
                            

                       
                    }
                
                
                System.out.print("First Name: ");
                fname = sr.next();
                
                System.out.print("Last Name: ");
                lname = sr.next();
                
                System.out.print("Email: ");
                email = sr.next();
                
                System.out.print("Username: ");
                usern = sr.next();
                
                System.out.print("Password: ");
                pass = sr.next();
                
                
                acc[i].addAccounts(ID, fname, lname, email, usern, pass);
                
            }
            
            for (int i = 0; i < num; i++) {
                acc[i].viewAccounts();
            }
        }
    
}
