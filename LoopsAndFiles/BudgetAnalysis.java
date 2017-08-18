/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopsAndFiles;
import java.util.Scanner;
/**
 *
 * @author LAB Student
 */
public class BudgetAnalysis {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the amount budgeted for a month: ");
        double amountBudgeted = keyboard.nextDouble();
        double total = 0;
        System.out.print("Please enter expenses or enter -1 to end: ");
        double expenses = keyboard.nextDouble();
        while (expenses > 0){
            total += expenses;
            System.out.print("Please enter expenses or enter -1 to end: ");
            expenses = keyboard.nextDouble();
        }
        if((amountBudgeted - total) > 0)
            System.out.println("User is under budget");
        else if((amountBudgeted - total) < 0)   
            System.out.println("User is over budget");
        else
            System.out.println("User is on budget");
        
    }
}
