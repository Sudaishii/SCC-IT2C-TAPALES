/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappc;

/**
 *
 * @author Administrator
 */
            
public class Accounts {
    
            int ID = 0;
            String F_name = "", L_name = "", eml = "", usern = "", pass = "";
                 
   
            
        public void addAccounts(int ID, String fname, String lname, String email, String username, String pass){
            this.ID = ID;
            this.F_name = fname;
            this.L_name = lname;
            this.eml = email;
            this.usern = username;
            this.pass = pass;
            
        }
       
       public void viewAccounts(){
           
           System.out.printf("| %-10d | %-10s | %-10s | %-30s | %-10s | %-15s | \n", this.ID, this.F_name, this.L_name, this.eml, this.usern, this.pass );
           
           //commit
       } 

    
   
    
}
