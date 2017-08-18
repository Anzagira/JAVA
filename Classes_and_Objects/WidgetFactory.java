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
public class WidgetFactory {
    private int numberOfWidgets;
    
    public void setNumberOfWidgets(int widgets){
        numberOfWidgets = widgets;
    }
    
    public double getnumberOfDays(){
        return (double) numberOfWidgets/(10*16);
    }
}
