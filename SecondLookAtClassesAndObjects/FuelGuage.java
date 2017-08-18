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
public class FuelGuage {
    private int amountOfFuel;
    public FuelGuage(FuelGuage reading1){
        this.amountOfFuel = reading1.amountOfFuel;
    }
    public FuelGuage(){
        amountOfFuel = 0;
    }
    public void setAmountOfFuel(int fuel){
        if(fuel > 15)
            amountOfFuel = 15;
        else 
            amountOfFuel = fuel;
    }
    public int getAmountOfFuel(){
        return amountOfFuel;
    }
    public void addFuel(){
        if(amountOfFuel < 15)
            amountOfFuel += 1;
    }
    public void burnFuel(){
        if(amountOfFuel > 0)
            amountOfFuel -= 1;
    }
    
}
    
    
