/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_and_Objects;

/**
 *
 * @author LAB Student
 */
public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;
    
    public void setDescription(String name){
        description = name;
    }
    
    public void setUnitsOnHand(int number){
        unitsOnHand = number;
    }
    
    public void setPrice(double cost){
        price = cost;
    }
    
    public String getDescription(){
        return description;
    }
    
    public int getUnitsOnHand(){
        return unitsOnHand;
    }
    
    public double getPrice(){
        return price;
    }
}
