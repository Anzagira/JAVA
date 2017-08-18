/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionStructures;

/**
 *
 * @author LAB Student
 */
public class BankCharges {
    private int numberOfChecks;
    private double endingAccountBalance;
    private double total;
    
    public void setNumberOfChecks(int checks){
        numberOfChecks = checks;
    }
    
    public void setEndingAccountBalance(double balance){
        endingAccountBalance = balance;
    }
    
    public double getBankFees(){
        
        if (numberOfChecks < 20){
            if (endingAccountBalance > 400){
                total = 0.10 * numberOfChecks;
            }
            else
                total = (0.10 * numberOfChecks) +15;
        }
        if (numberOfChecks > 20 && numberOfChecks < 40){
            if (endingAccountBalance > 400){
                total = 0.08 * numberOfChecks;
            }
            else
                total = (0.08 * numberOfChecks) +15;
        }
        if (numberOfChecks > 40 && numberOfChecks < 60){
            if (endingAccountBalance > 400){
                total = 0.06 * numberOfChecks;
            }
            else
                total = (0.06* numberOfChecks) +15;
        }
        if (numberOfChecks > 60){
            if (endingAccountBalance > 400){
                total = 0.04 * numberOfChecks;
            }
            else
                total = (0.04 * numberOfChecks) +15;
        }
        return total;
    }
}
