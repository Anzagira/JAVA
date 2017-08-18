/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_fundamentals;

/**
 *
 * @author LAB Student
 */
public class prob14 {
         public static void main(String[] args) {
     
         int numberOfShares = 600;
         double costPricePerShare = 21.77;
         //double sellingPricePerShare = 33.92;
         double brokerPercentage = 0.02;
         double cost = numberOfShares * costPricePerShare * (1 + brokerPercentage);
         //double revenue = numberOfShares * sellingPricePerShare * (1 - brokerPercentage);
         
         System.out.println("Amount paid for the stock alone: " + numberOfShares * costPricePerShare  + 
                            "\n Amount of Commission: " + numberOfShares * costPricePerShare * brokerPercentage + 
                            "\n Total Amount Paid: " + cost);
         }
}
