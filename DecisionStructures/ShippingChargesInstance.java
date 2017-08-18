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
public class ShippingChargesInstance {
    public static void main(String[] args){
        ShippingCharges bill = new ShippingCharges();
        bill.setWeightOfPackage(8);
        bill.setMilesShipped(550);
        System.out.println("The Shipping Charges for the Package is: $" + bill.getShippingCharges());
    }
}
