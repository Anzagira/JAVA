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
public class RetailItemInfo {
    public static void main(String[] args){
        RetailItem item1 =new RetailItem();
        item1.setDescription("Jacket");
        item1.setUnitsOnHand(12);
        item1.setPrice(59.95);
        
        RetailItem item2 =new RetailItem();
        item2.setDescription("Designer Jeans");
        item2.setUnitsOnHand(40);
        item2.setPrice(34.95);
        
        RetailItem item3 =new RetailItem();
        item3.setDescription("Shirt");
        item3.setUnitsOnHand(20);
        item3.setPrice(24.95);
        
        System.out.println("Description: " + item1.getDescription() + 
                           "\nUnits on Hand: " + item1.getUnitsOnHand() + 
                           "\nPrice: " + item1.getPrice() + "\n");
      
        System.out.println("Description: " + item2.getDescription() + 
                           "\nUnits on Hand: " + item2.getUnitsOnHand() + 
                           "\nPrice: " + item2.getPrice() + "\n" );

        System.out.println("Description: " + item3.getDescription() + 
                           "\nUnits on Hand: " + item3.getUnitsOnHand() + 
                           "\nPrice: " + item3.getPrice());
    }
}
