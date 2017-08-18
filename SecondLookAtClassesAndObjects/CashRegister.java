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
public class CashRegister {
    private int numberOfItems;
    private RetailItem item;
    public CashRegister( int items, RetailItem item1){
        numberOfItems = items;
        item = new RetailItem(item1);
        
    }
    public double getSubtotal(){
        return numberOfItems * item.getRetail();
    }
    public double getTax(){
        return 0.06 * this.getSubtotal();
    }
    public double getTotal(){
        return this.getSubtotal() + this.getTax();
    }
}
