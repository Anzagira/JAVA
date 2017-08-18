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
public class GreatestAndLeast {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter integers or -99 to end: ");
        int number = keyboard.nextInt();
        int least = number;
        int greatest = number;
        while (number != -99){
            if (number > greatest)
                greatest = number;
            if (number < least)
                least = number;
            System.out.print("Please enter integers or -99 to end: ");
            number = keyboard.nextInt();
        }
        System.out.println("Largest numbers: " + greatest);    
        System.out.println("Smallest numbers: " +least); 
    }
}
