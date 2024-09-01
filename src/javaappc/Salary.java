/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappc;

import java.util.*;
public class Salary {
        
    
     public static void Employees(){
        
        Salaries[] sal = new Salaries[100];
        
        Scanner sr = new Scanner(System.in);
        
        int ID, rate, h_worked, total_ded, num_emp;
        String name;
        float Salary = 0, TDeduc = 0;
        
        System.out.print("Enter the no. of Employees: ");
        num_emp = sr.nextInt();
        
        for (int i = 0; i < num_emp; i++) {
            System.out.println("Details of Employee "+(i+1)+": ");
            System.out.print("ID: ");
            ID = sr.nextInt();
            
            System.out.print("Name: ");
            name = sr.next();
            
            System.out.print("Rate (Hour): ");
            rate = sr.nextInt();
            
            
            System.out.print("Hours Worked: ");
            h_worked = sr.nextInt();
            
            
            System.out.print("Total Deduction: ");
            total_ded = sr.nextInt();
            
            sal[i] = new Salaries();
            sal[i].addEmp(ID, name, rate, h_worked, total_ded);
            
            Salary += (rate * h_worked);
            TDeduc += (total_ded);
            
            
        }
      
        
        
         System.out.print("\n\n\n\n");
         System.out.printf(" %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |\n", "ID", "NAME", "RATE", "HOURS", "GROSS", "REDUCTIONS", "NETPAY");
        
        for (int i = 0; i < num_emp; i++) {
            sal[i].DisplayEmp();
            
        }
         System.out.println("---------------------------------------------------------------------------------------\n");
         System.out.printf("Total Salary for Request: %.2f\n", Salary);
         System.out.printf("Total Deductions: %.2f\n", TDeduc);
         System.out.printf("Total Salary for Request: %.2f\n", (Salary - TDeduc));
         
    }
}
