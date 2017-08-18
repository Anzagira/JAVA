/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndArrayLists;
import java.util.Scanner;
/**
 *
 * @author Allan
 */
public class ChargeAccountValidInstance {
    public static void main(String[] args){
        ChargeAccountValidation job = new ChargeAccountValidation();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the account number you like to search: ");
        int acct = keyboard.nextInt();
        if(job.searchAcctNumber(acct))
            System.out.println("The Account Number is Valid");
        else
            System.out.println("The Account Number is Invalid");
    }
}
