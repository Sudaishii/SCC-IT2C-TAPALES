
package javaappc;

import java.util.*;
public class Grade {
    
    
    public void editGrades(Grades[] grs, int size, int id){
           Scanner sc = new Scanner(System.in);
           
        for (int i = 0; i < size; i++) {
                 
                if(grs[i].id == id){
                    
                    
                    System.out.println("New Prelim Grades: ");
                   
                    grs[i].p = sc.nextFloat();
                    
                    System.out.println("New Midterm Grades: ");
                   
                    grs[i].m = sc.nextFloat();
                    
                    System.out.println("New PreFinal Grades: ");
                    
                    grs[i].pf = sc.nextFloat();
                    
                    System.out.println("New Final Grades: ");
                   
                    grs[i].f = sc.nextFloat();
                    
                    
                    System.out.println("GRADES UPDATED!");
                    return;
                    
                    
                }
        
        }
        
        
    }
   
    
    public void Students(){
    
    Grades[] gr = new Grades[100];
    Scanner sr = new Scanner(System.in);
    
    
    int id = 0, num = 0;
    String name, option;
    float pre, mid, pref, finals;
    
    
        do{
    
    
        System.out.println("\nWelcome to Grading App");
        System.out.println("--------------------------");
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        System.out.println("--------------------------");
        
        int opt;
        
        System.out.print("Enter Option: ");
        opt = sr.nextInt();
        
        
        while(opt > 5 || opt < 1){
            System.out.print("\tInvalid! Enter Option Again: ");
            opt = sr.nextInt();    
        }
    
    
        switch(opt){
    
            case 1:
        System.out.print("Enter Number of Students: ");
        num  = sr.nextInt();
    
        for (int i = 0; i < num; i++) {
            
            System.out.print("ID: ");
            id = sr.nextInt();
            
            System.out.print("Name: ");
            name = sr.next();
            
            System.out.print("PRELIM: ");
            pre = sr.nextFloat();
            
            System.out.print("MIDTERM: ");
            mid = sr.nextFloat();
            
            System.out.print("PRE-FINAL: ");
            pref = sr.nextFloat();
            
            System.out.print("FINALS: ");
            finals = sr.nextFloat();
            
            System.out.println("");
            
            gr[i] = new Grades();
            gr[i].addGrade(id,name,pre,mid,pref,finals);
                    
        }
         break;   
            
       case 2:
        System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |\n", "ID", "NAME", "PRELIM", "MIDTERM", "PRE-FINAL", "FINALS", "AVERAGE", "REMARKS");
        for (int i = 0; i < num; i++) {
           
            gr[i].ViewGrade();
        }
        break;
        
       case 3: 
            
                 System.out.println("Enter the ID to update: ");
                int ids = sr.nextInt();
                System.out.println(""+ids);
                editGrades(gr, num, ids);
                break;  
    }  
            System.out.print("Do you want to continues the Transaction: (y/n)");
            option = sr.next();
        
    } while(option.equals("Y") || option.equals("y"));
        }
    
}
