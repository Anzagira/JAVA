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
public class prob13 {
    
    public static void main (String[] args){
        double mealCost;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the charge for the meal: ");
        mealCost = keyboard.nextDouble();
        
        System.out.println("Meal Charge: " + mealCost + 
                           "\n Tax amount: " + mealCost * 0.0675 + 
                           "\n Tip amount: " + 0.15 * (mealCost * 1.0675) + 
                           "\n Total bill: " + 1.15 * (mealCost * 1.0675));
    }
    
}
