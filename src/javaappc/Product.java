/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappc;

import java.util.*;

public class Product {
        
        public static void Products(){
            
            Products[] pr = new Products[100];
            Scanner sr = new Scanner(System.in);
            
            int num, id, sold, stock;
            String name;
            float price;
            
            System.out.print("Enter Number of Products: ");
            num = sr.nextInt();
            
            System.out.println("PRODUCT DETAILS: ");
            
            for (int i = 0; i < num; i++) {
                
                System.out.println("Details of Product "+(i+1)+": ");
                
                System.out.print("ID: ");
                id = sr.nextInt();
                
                System.out.print("NAME: ");
                name = sr.next();
                
                System.out.print("PRICE: ");
                price = sr.nextFloat();
                
                System.out.print("SOLD: ");
                sold = sr.nextInt();
                
                System.out.print("STOCK: ");
                stock = sr.nextInt();
                
                System.out.println("");
                
                pr[i] = new Products();
                pr[i].addProduct(id, name, price, sold, stock);
            }
            
            System.out.print("\n\n");
            System.out.printf(" %-12s | %-12s | %-10.2s | %-10s | %-10s | %-10s | %-12s | %-12s |\n", "ID", "NAME", "PRICE", "SOLD", "STOCK", "PROFIT", "STATUS", "TEP");
             
            for (int i = 0; i < num; i++) {
                pr[i].viewProducts();
            }
        }
    
    
    
}
