/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopsAndFiles;
import java.io.*;
import java.util.Scanner;
// PrintWriter outputFile = new PrintWriter(filename) - Creates an instance of method for writing into a filename(document.txt)
//outputFile.println("Kofi") - Writes Kofi into the File
//outputFile.close() - Closes the file
// throws IOException - required by every method header to prevent compiler error (that is capable of throwing IOException type)
//For complete Filename, add location of file eg. ("C:/Documents/document.txt"). Note in unix, use ("C:\\Documents\\document.txt")

//For reading a File (eg. document.txt), 
//File myFile = new File("document.txt) - Creates instance of File Class for reading document.txt
//Scanner inputFile = new Scanner (myFile) - Creates scanner object that uses file document.txt as source of input.
//inputFile.close() - Closes the file after reading
//inputFile.nextLine() - Reads First line from document.txt
//inputFile.hasNext() - Returns False to indicate end of File. Returns True to indicate more lines available in File
//inputFile.exists() - Checks if the file already exists.
//Remember throws IOException applies to method headers here too
/**
 *
 * @author LAB Student
 */
public class DepositAndWithdrawalFiles {
    public static void main(String[] args) throws IOException{
        SavingsAccount client = new SavingsAccount(500);
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the annual interest rate: ");
        float rate = keyboard.nextFloat();
        client.setAnnualInterestRate(rate);
        System.out.print("Please enter the starting balance: ");
        double bal = keyboard.nextDouble();
        client.setBalance(bal);
        File deposits = new File("C:/Users/Lab Student/Desktop/Deposits.txt");
        Scanner depTrans = new Scanner(deposits);
        File withdrawals = new File("C:/Users/Lab Student/Desktop/Withdrawals.txt");
        Scanner withTrans = new Scanner(withdrawals);
        double depCount = 0;
        double withCount = 0;
        while (depTrans.hasNext()|| withTrans.hasNext()){
            if (depTrans.hasNext()){
                double dep = depTrans.nextDouble();
                client.getDeposit(dep);
                depCount += dep;
            }
            if (withTrans.hasNext()){
                double with = withTrans.nextDouble();
                client.getWithdrawal(with);
                withCount += with;
            }
            client.getInterest();
        }
        System.out.println("Ending Balance: " + client.getBalance());
        System.out.println("Total Interest: " + (client.getBalance() - bal - depCount + withCount));
    }
}
