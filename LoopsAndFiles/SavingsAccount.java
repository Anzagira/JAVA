/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopsAndFiles;
// import java.io.* - Imports all methods required for writing and reading with Files
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
//Remember throws IOException applies to method headers here too

/**
 *
 * @author LAB Student
 */
public class SavingsAccount {
    private float annualInterestRate;
    private double balance;
    
    public SavingsAccount(double startingBalance){
        balance = startingBalance;
    }
    public void setBalance(double bal){
        balance = bal;
    }
    public void setAnnualInterestRate(float rate){
        annualInterestRate = rate;
    }
    public void getDeposit(double deposit){
        balance += deposit;   
    }
    public void getWithdrawal(double withdrawal){
        balance -= withdrawal;
    }
    public void getInterest(){
        balance += (annualInterestRate / (12*100)) * balance;
    }
    public double getBalance(){
        return balance;
    }
}
