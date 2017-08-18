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
public class WidgetFactoryInfo {
    public static void main(String[] args){
    WidgetFactory product = new WidgetFactory();
    product.setNumberOfWidgets(450);
    System.out.println("Number of Days needed is: " + product.getnumberOfDays());
    }
}
