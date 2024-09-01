
package javaappc;


public class Salaries {
    
    int ID, rt, h_worked;
    String name;
    float netpay, gross, salary = 0, tduc, release, total_ded;
    
    public void addEmp(int ID, String name, int rate, int hwork, int ded){
        this.ID = ID;
        this.name = name;
        this.rt = rate;
        this.h_worked = hwork;
        this.total_ded = ded;
        
        this.gross = rate * hwork;
        this.netpay = ((rate * hwork) - ded);
        
        
        
        
        
    }
    
    public void DisplayEmp(){
       
       System.out.printf(" %-10d | %-10s | %-10d | %-10d | %-10.2f | %-10.2f | %-10.2f | \n", this.ID, this.name, this.rt, this.h_worked, this.gross, this.total_ded, this.netpay);
  
    }

}