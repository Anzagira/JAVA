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
public class CarInstrumentSimulator {
    public static void main(String[] args){
        FuelGuage reading1 = new FuelGuage();
        reading1.setAmountOfFuel(1);
        reading1.addFuel();
        Odometer car = new Odometer(58250, reading1);
        for(int i = 0; i < 48; i++){
            car.increaseMileage();
            car.setFuelAmount(reading1);
            System.out.println("Current Mileage: " + car.getCurrentMileage() +
                           "\nAmount of Fuel: " + reading1.getAmountOfFuel());
        }
        
    }
}
