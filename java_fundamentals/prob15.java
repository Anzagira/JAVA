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
public class prob15 {
    public static void main(String[] args){
        long numCustomers = 12467;
        double percentEnergy = 0.14;
        double percentCitrus = 0.64 * 0.14;
        
        System.out.println("Number of customers for Energy Drinks: " + numCustomers * percentEnergy + 
                         "\nNumber of customers for Citrus Energy Drinks: " + numCustomers * percentCitrus);
    }

}
