/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappc;

import java.util.*;
public class Main {
    
    
    
    public static void main (String [] args){
        
        
        Salary sal = new Salary();
        Grade gr = new Grade();
        Product pr = new Product();
        NetPay npg = new NetPay();
        Account acc = new Account();
        Scanner sc = new Scanner(System.in);
        
        int choice;
        
        
      
        System.out.println("Case 1: Students \nCase 2: Employees \nCase 3: Products \nCase 4: Net Pay \nCase 5: Accounts");
        
        System.out.print("\nEnter A Choice: ");
        choice = sc.nextInt();
        
        
        
        switch(choice){
            case 1:
                gr.Students();
                break;
            case 2:
                sal.Employees();
                break;
            case 3: 
                pr.Products();
                break;
            case 4:
                npg.getPay();
                break;
            case 5:
                acc.Accounts();
                break;
            default:
                System.out.print("\tINVALID CHOICE!");
                
            
                
        }
      
        
  }
        
        
    //    Grades gr = new Grades();
    //    
    //    gr.addGrade(101, "Mike", 1.0, 1.0, 1.0, 1.0);
    //    gr.ViewGrade();
    //    
    //    Grades gr1 = new Grades();
    //    gr1.addGrade(102, "John", 2.0, 1.0, 3.0, 1.0);
    //    gr1.ViewGrade();
        
//    
//       System.out.printf(" %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-12s | %-12s | \n", "Product ID: ", "Product Name", "Price", "Sold", "Stock", "Profit", "Status", "TEP");
//       Product prdct = new Product();
//       prdct.addProduct(10011, "Soap", (float)20.00, 30, 30);
//       prdct.viewProducts();
//       
//       Product prdct1 = new Product();
//       prdct1.addProduct(10012, "Cards", (float)50.00, 60, 0);
//       prdct1.viewProducts();
//       
       


}
