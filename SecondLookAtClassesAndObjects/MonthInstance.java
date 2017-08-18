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
public class MonthInstance {
    public static void main(String[] args){
        Month date = new Month(3);
        Month bday = new Month();
        System.out.println(bday.getMonthName());
        System.out.println(bday.getMonthNumber());
        System.out.println(bday.toString());
        System.out.println(date.equals(bday));
        System.out.println(date.lessThan(bday));
        bday.setMonthNumber(3);
        System.out.println(date.equals(bday));
    }
       
        
}
