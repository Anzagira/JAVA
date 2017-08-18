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
public class BankChargesInstance {
    public static void main(String[] args){
        BankCharges person = new BankCharges();
        person.setNumberOfChecks(50);
        person.setEndingAccountBalance(300);
        System.out.println("Bank Charges: " +person.getBankFees());
    }
}
