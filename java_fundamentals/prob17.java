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
public class prob17 {
     public static void main(String[] args) {
     
         int numberOfShares = 1000;
         double costPricePerShare = 32.87;
         double sellingPricePerShare = 33.92;
         double brokerPercentage = 0.02;
         double cost = numberOfShares * costPricePerShare * (1 + brokerPercentage);
         double revenue = numberOfShares * sellingPricePerShare * (1 - brokerPercentage);
         
         System.out.println("Amount Joe paid for the stock: " + numberOfShares * costPricePerShare  + 
                            "\n Amount of Commission on Buying: " + numberOfShares * costPricePerShare * brokerPercentage + 
                            "\n Amount Joe sold the stock for: " + numberOfShares * sellingPricePerShare  +  
                            "\n Amount of Commission on Selling: " + numberOfShares * sellingPricePerShare * brokerPercentage +
                            "\n Profit Joe Made: " + (revenue - cost));
         
     }
}
