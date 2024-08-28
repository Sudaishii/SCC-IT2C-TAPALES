
package javaappc;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class NetPay {
    public void getPay(){
           
        Scanner input= new Scanner(System.in);
      
       
        String name;
        int age, rate, Thours, deduc;
        double gross, netpay;
        
        System.out.print("Enter your name: ");
        name = input.nextLine();
        
        System.out.print("Enter Age: ");
        age= input.nextInt();
        
        System.out.print("Enter Rate per Hour: ");
        rate = input.nextInt();
        
        System.out.print("Enter Total hours worked: ");
        Thours = input.nextInt();
        
        System.out.print("Enter Total Deductions: ");
        deduc = input.nextInt();
        
        Locale locale = new Locale("ph", "PH");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String date = dateFormat.format(new Date());
        
        System.out.println("\n\n\n----------------------------------");
        System.out.print("SLIP DETAILS\n");
        System.out.print("----------------------------------");
        
        System.out.println("\nDate: "+date);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        
         
        
        gross = (double)(Thours*rate);
        double money = gross;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("ph", "PH"));
        String money1 = formatter.format(money);
        
        netpay = (double)(gross-deduc);
        double netpayf = netpay;
        NumberFormat formatter1 = NumberFormat.getCurrencyInstance(new Locale("ph", "PH"));
        String netpay1 = formatter1.format(netpayf);
                
        System.out.println("\nTotal Gross: "+money1);
        System.out.println("Total Deduction: "+deduc);
        System.out.println("----------------------------------");
        System.out.print("Net Pay: "+(netpay1));
        System.out.print("\n----------------------------------");
        
        
    }
}
