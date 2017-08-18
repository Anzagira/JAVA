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
public class Odometer {
    private int currentMileage;
    private int increase = 0;
    private FuelGuage reading;
    public void setCurrentMileage(int mileage){
        if(mileage > 999999)
            currentMileage = 0;
        else
            currentMileage = mileage;
    }
    public Odometer(int mileage, FuelGuage reading1){
        if(mileage > 999999)
            currentMileage = 0;
        else
            currentMileage = mileage;
        reading = new FuelGuage(reading1);
    }
    public int getCurrentMileage(){
        return currentMileage;
    }
    public void increaseMileage(){
        if(currentMileage < 999999){
            currentMileage += 1;
            increase++;
        }
        if(currentMileage == 999999){
            currentMileage = 0;
            increase++;
        }
    }
    public void setFuelAmount(FuelGuage reading1){
        if(increase == 24){
            reading1.burnFuel();
            increase = 0;
        }
        
    }
    
}
