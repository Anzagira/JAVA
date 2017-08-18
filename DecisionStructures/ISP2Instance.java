/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionStructures;

import java.util.Scanner;

/**
 *
 * @author LAB Student
 */
public class ISP2Instance {
        public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter A, B or C for the Package: ");
        String pack = keyboard.nextLine();
        System.out.print("Please enter the number of hours: ");
        int hours = keyboard.nextInt();
        
        ISP2 customer = new ISP2();
        customer.setPackage(pack);
        customer.setNumberOfHours(hours);
        System.out.println("Total Charge for internet is " + customer.getTotalCharges());
        customer.getSavings();
        }
}
