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
public class SoftwareSalesInstance {
    public static void main(String[] args){
        SoftwareSales buyer = new SoftwareSales();
        buyer.setNumberofUnits(58);
        System.out.println("Total Cost: " + buyer.getTotalCost());
    }
}
