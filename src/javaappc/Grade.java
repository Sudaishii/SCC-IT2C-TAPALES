
package javaappc;

import java.util.*;
public class Grade {
    
    public static void Students(){
    
    Grades[] gr = new Grades[100];
    Scanner sr = new Scanner(System.in);
    
    
    int id, num;
    String name;
    float pre, mid, pref, finals;
    
    
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
            
            System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |\n", "ID", "NAME", "PRELIM", "MIDTERM", "PRE-FINAL", "FINALS", "AVERAGE", "REMARKS");
        
        for (int i = 0; i < num; i++) {
           
            gr[i].ViewGrade();
        }
            
    }
}
