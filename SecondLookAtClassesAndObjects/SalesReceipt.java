/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondLookAtClassesAndObjects;

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

/**
 *
 * @author LAB Student
 */
public class SalesReceipt {
        public static void main(String[] args)throws IOException{
        RetailItem item1 = new RetailItem("Candy bar", 17789, 7.5, 10);
        File receipt = new File("C:/Users/Lab Student/Desktop/Sales Receipt.txt");
        PrintWriter outFile = new PrintWriter(receipt);
        DecimalFormat decformat = new DecimalFormat("#,#00.00");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the quantity of items; ");
        int items = keyboard.nextInt();
        CashRegister sale = new CashRegister(items, item1);
        outFile.println("SALES RECEIPT");
        outFile.println("Unit Price: $" + decformat.format(item1.getRetail()));
        outFile.println("Quantity: " + items);
        outFile.println("Subtotal: $" + decformat.format(sale.getSubtotal()));
        outFile.println("Sales Tax: $" + decformat.format(sale.getTax()));
        outFile.println("Total: $" + decformat.format(sale.getTotal()));
        outFile.close();
    }
}
