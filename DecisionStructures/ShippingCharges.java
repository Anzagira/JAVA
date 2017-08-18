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
public class ShippingCharges {
    private int weightOfPackage;
    private double milesShipped;
    //private double totalCharges;
    
    public void setWeightOfPackage(int weight){
        weightOfPackage = weight;
    }
    public void setMilesShipped(int miles){
        milesShipped = miles;
    }
    
    public double getShippingCharges(){
        double totalCharges = 0;
        if(weightOfPackage <= 2){
           totalCharges = 1.10 * Math.ceil(milesShipped/500); 
        }
        if(weightOfPackage > 2 && weightOfPackage <= 6 ){
           totalCharges = 2.20 *Math.ceil(milesShipped/500); 
        }
        if(weightOfPackage > 6 && weightOfPackage <= 10 ){
           totalCharges = 3.70 *Math.ceil(milesShipped/500); 
        }
        if(weightOfPackage > 10){
           totalCharges = 4.80 *Math.ceil(milesShipped/500); 
        }
        return totalCharges;
    }
}

    
