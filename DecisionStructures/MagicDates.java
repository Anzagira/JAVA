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
public class MagicDates {
    private int day, month, year;
    
    public MagicDates(int days, int months, int years){
        day = days;
        month = months;
        year = years;
    }
    public void isMagic(){
        if (month * day == year)
            System.out.printf("%2d/%2d/%2d is a Magic Date\n",month,day,year);
        else{
            System.out.printf("%2d/%2d/%2d is not a Magic Date\n",month,day,year);
        }
        
    }
    
}
