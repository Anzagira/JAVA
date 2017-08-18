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
public class SoftwareSales {
    private int numberOfUnits;
    public void setNumberofUnits(int units){
        numberOfUnits = units;
    }
    public double getTotalCost(){
        double totalCost = 0;
        if(numberOfUnits >= 10 && numberOfUnits < 20)
            totalCost = 0.02 * 99 * numberOfUnits;
        if(numberOfUnits >= 20 && numberOfUnits < 50)
            totalCost = 0.03 * 99 * numberOfUnits;
        if(numberOfUnits >= 50 && numberOfUnits < 100)
            totalCost = 0.04 * 99 * numberOfUnits;
        if(numberOfUnits >= 100)
            totalCost = 0.05 * 99 * numberOfUnits;
        return totalCost;
    }
    
}
