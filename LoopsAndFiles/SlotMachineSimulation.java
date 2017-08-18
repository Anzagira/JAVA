/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopsAndFiles;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author LAB Student
 */
public class SlotMachineSimulation {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random randomnumbers = new Random();
        //System.out.print("Please enter the amount: ");
        double totalAmount = 0;
        String word1="";
        String word2="";
        String word3="";
        String ans;
        double payout = 0;
        do{
            System.out.print("Please enter the amount: ");
            double amount = keyboard.nextDouble();
            int num1 = randomnumbers.nextInt(6);
            System.out.println(num1);
            switch(num1){
                case 0:
                    word1 = "Cherries";
                    break;
                case 1:
                    word1 = "Oranges";
                    break;
                case 2:
                    word1 = "Plums";
                    break;
                case 3:
                    word1 = "Bells";
                    break;
                case 4:
                    word1 = "Melons";
                    break;
                case 5:
                    word1 = "Bars";
                    break;
            }
            int num2 = randomnumbers.nextInt(6);
            System.out.println(num2);
            switch(num2){
                case 0:
                    word2 = "Cherries";
                    break;
                case 1:
                    word2 = "Oranges";
                    break;
                case 2:
                     word2 = "Plums";
                     break;
                case 3:
                     word2 = "Bells";
                     break;                 
                case 4:
                     word2 = "Melons";
                     break;                 
                case 5:
                     word2 = "Bars";
                     break;
            }
            int num3 = randomnumbers.nextInt(6);
            System.out.println(num3);
            switch(num3){
                case 0:
                    word3 = "Cherries";
                    break;
                case 1:
                    word3 = "Oranges";
                    break;
                case 2:
                     word3 = "Plums";
                     break;
                case 3:                    
                     word3 = "Bells";
                     break;
                case 4:
                     word3 = "Melons";
                     break;
                case 5:
                     word3 = "Bars";  
                     break;
            }
            if (word1.equals(word2) && word2.equals(word3))
                payout += amount * 3;
            else if (word1.equals(word2) || word2.equals(word3) || word1.equals(word3))
                payout += amount * 2;
            else
                payout += 0;
            totalAmount += amount;
            System.out.print("Do you want to play again? yes or no: ");
            ans = keyboard.next();
        }while (ans.equalsIgnoreCase("yes"));             
        System.out.println("Total Amount Entered: " + totalAmount +
                           "\nTotal Payout: " + payout);
    
    
}
}
