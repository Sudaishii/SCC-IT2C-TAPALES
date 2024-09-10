package javaappc;


public class Products {
    
    int pID, sold, stock;
    String name, Stat;
    float price, profit, expP;
    
    
    public void  addProduct(int p, String name, float p1, int sold1, int stock1){
        this.pID = p;
        this.name = name;
        this.price = p1;
        this.sold = sold1;
        this.stock = stock1;
    }
    
    public void viewProducts(){
        
        this.profit = (float)this.sold * this.price;
        Stat = (stock > 0) ? "Available" : "Out of Stock";
        this.expP = this.price * (float)this.sold;
        
        System.out.printf(" %-12d | %-12s | %-10.2f | %-10d | %-10d | %-10.2f | %-12s | %-12.2f |\n", this.pID, this.name, this.price, this.sold, this.stock, this.profit, Stat, this.expP);
        
        
    }
    
}
