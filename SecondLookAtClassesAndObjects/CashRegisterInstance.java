/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondLookAtClassesAndObjects;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author LAB Student
 */
public class CashRegisterInstance {
    public static void main(String[] args){
        RetailItem item1 = new RetailItem("Candy bar", 17789, 7.5, 10);
        DecimalFormat decformat = new DecimalFormat("#,#00.00");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the quantity of items; ");
        int items = keyboard.nextInt();
        CashRegister sale = new CashRegister(items, item1);
        System.out.println("Unit Price: $" + decformat.format(item1.getRetail()) 
                           + "\nQuantity: " + items
                           + "\nSubtotal: $" + decformat.format(sale.getSubtotal())
                           + "\nSales Tax: $" +decformat.format(sale.getTax())
                           + "\nTotal: $" + decformat.format(sale.getTotal()));               
    }
}
