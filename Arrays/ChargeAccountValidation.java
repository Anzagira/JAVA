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
public class ChargeAccountValidation {
    private final int[] acctNumbers = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
                                       8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
                                       1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
    public boolean searchAcctNumber(int acct){
        boolean status = false;
        for(int i = 0; i < acctNumbers.length; i++){
            if(acctNumbers[i] == acct)
                status = true;
        }
        return status;
    }
}
