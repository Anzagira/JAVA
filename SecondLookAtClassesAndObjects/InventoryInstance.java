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
public class InventoryInstance {
    public static void main(String[] args){
        InventoryItemCopyConstructor nadew = new InventoryItemCopyConstructor("Nadew", 25);
        System.out.println(" Nadew's Description: " + nadew.getDescription() +
                           " Nadew's Units: " + nadew.getUnits());
        InventoryItemCopyConstructor allan = new InventoryItemCopyConstructor(nadew);
        nadew.setDescription("Genius");
        nadew.setUnits(100);
        System.out.println(" Nadew's Description: " + nadew.getDescription() +
                           " Nadew's Units: " + nadew.getUnits());
        System.out.println(" Allan's Description: " + allan.getDescription() +
                           " Allan's Units: " + allan.getUnits());
        
    }
}
