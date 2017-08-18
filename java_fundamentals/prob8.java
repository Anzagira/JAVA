/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_fundamentals;
import java.util.Scanner;
/**
 *
 * @author LAB Student
 */
public class prob8 {
    public static void main(String[] args){
        float amount;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the amount of the purchase: ");
        amount = keyboard.nextFloat();
        System.out.println("Amount of the purchase: " + amount +
                           "\n State sales tax: " + amount * 0.04 + 
                           "\n County sales tax: " + amount * 0.02 + 
                           "\n Total sales tax: " + amount *(0.02 + 0.04) + 
                           "\n Total of the sale: " + amount * (1 + 0.02 + 0.04) );
    }
}
