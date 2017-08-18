/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondLookAtClassesAndObjects;

/**
 *
 * @author LAB Student
 */
public class InventoryItemCopyConstructor {
    private String description;
    private int units;
    
    public InventoryItemCopyConstructor(){
        description = "";
        units = 0;
    }
    public InventoryItemCopyConstructor(String d){
        description = d;
        units = 0;
    }   
    public InventoryItemCopyConstructor(String d, int u){
        description = d;
        units = u;
    }    
    public InventoryItemCopyConstructor(InventoryItemCopyConstructor item){
        description = item.description;
        units = item.units;
    }
//public InventoryItemCopyConstructor(InventoryItemCopyConstructor item) - Copy constructor used to copy fields of argument object 
//into a new object to be defined. Used in instance by  
//InventoryItemCopyConstructor allan = new InventoryItemCopyConstructor(nadew) - Copy nadew's fields into allan object.
    
    public void setDescription(String d){
        description = d;
    }
    public void setUnits(int u){
        units = u;
    }
    public String getDescription(){
        return description;
    }
    public int getUnits(){
        return units;
    }
}
