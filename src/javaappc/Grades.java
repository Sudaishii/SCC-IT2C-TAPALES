

package javaappc;


public class Grades {
        
    int id;
    String name;
    float p, m, pf, f;
    
    
    
    public void addGrade(int sid, String name, float pre, float mid, float prefi, float fin){
            this.name = name;
            this.id = sid;
            this.p = pre;
            this.m = mid;
            this.pf = prefi;
            this.f = fin;
    }
    
    public void ViewGrade(){
               double ave = (this.p + this.m + this.pf + this.f) /4;
               String remarks = (ave > 3.0) ? "Failed" : "Passed"; 
               
               
               System.out.printf("| %-10d | %-10s | %-10.2f | %-10.2f | %-10.2f | %-10.2f | %-10.2f | %-10s |\n",
                       this.id, this.name, this.p, this.m, this.pf, this.f, ave, remarks);
    
    
    }

  
}
        
  
 

