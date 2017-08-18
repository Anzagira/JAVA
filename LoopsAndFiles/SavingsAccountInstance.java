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
public class SavingsAccountInstance {
    public static void main(String[] args){
        SavingsAccount client = new SavingsAccount(2000);
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the annual interest rate: ");
        float rate = keyboard.nextFloat();
        client.setAnnualInterestRate(rate);
        System.out.print("Please enter the starting balance: ");
        double bal = keyboard.nextDouble();
        client.setBalance(bal);
        System.out.print("Please enter the number of months: ");
        int months = keyboard.nextInt();
        double depCount = 0;
        double withCount = 0;
               
        for (int i = 0; i < months; i++){
            System.out.print("Please enter amount deposited: ");
            double deposit = keyboard.nextDouble();
            depCount += deposit;
            client.getDeposit(deposit);
            System.out.print("Please enter amount withdrawn: ");
            double withdrawal = keyboard.nextDouble();         
            withCount += withdrawal;
            client.getWithdrawal(withdrawal);
            client.getInterest();
        }
        double totalInterest = client.getBalance() - bal;
        System.out.println("Ending Balance: " + client.getBalance());
        System.out.println("Total Ammount of Deposits: " + depCount);
        System.out.println("Total Amount of Withdrawals: " + withCount);
        System.out.println("Total Interest: " + totalInterest);
        
    }
}
