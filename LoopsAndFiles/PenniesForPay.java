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
public class PenniesForPay {
    public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the number of Days: ");
    int numOfDays = keyboard.nextInt();
    while (numOfDays > 0){
        double totalPay = 0;
        System.out.println("Day\t\t\tSalary");
        System.out.print("-----------------------------------\n");
        for (int i = 0; i < numOfDays; i++){
            totalPay += Math.pow(2, i);
            System.out.println((i+1)+"\t\t\t"+Math.pow(2, i));
        }
        System.out.println("Total Pay: \t\t$" + totalPay/100);
        System.out.print("Enter the number of Days: ");
        numOfDays = keyboard.nextInt();
    }
        
    
}
}
