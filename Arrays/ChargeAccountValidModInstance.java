/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndArrayLists;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Allan
 */
public class ChargeAccountValidModInstance {
    public static void main(String[] args) throws IOException{
        ChargeAccountValidationMod job = new ChargeAccountValidationMod();
        Scanner keyboard = new Scanner(System.in);
        File input = new File("C:/Users/Allan/Desktop/AcctNumbers.txt");
        Scanner inputFile = new Scanner(input);
        int index = 0;
        int[] account = new int[30];
        while (inputFile.hasNext() && index < account.length){
            account[index] = inputFile.nextInt();
            index++;
        }
        job.setAcctNumbers(account);        
        System.out.print("Please enter the account number you like to search: ");
        int acct = keyboard.nextInt();
        if(job.searchAcctNumber(acct))
            System.out.println("The Account Number is Valid");
        else
            System.out.println("The Account Number is Invalid");
    }
}
