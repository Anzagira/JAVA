/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndArrayLists;

/**
 *
 * @author Allan
 */
public class ChargeAccountValidationMod {
    private int[] acctNumbers;
    public void setAcctNumbers(int[] accounts){
        acctNumbers = accounts;
    }
    public boolean searchAcctNumber(int acct){
        boolean status = false;
        for(int i = 0; i < acctNumbers.length; i++){
            if(acctNumbers[i] == acct)
                status = true;
        }
        return status;
    }
}
