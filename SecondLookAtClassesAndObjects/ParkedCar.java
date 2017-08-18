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
public class ParkedCar {
    //enum CarMake{Volvo, Nissan, Toyota, Honda, Hyundai}
    //enum CarModel{s40, Altima, Prius, Civic, Elantra}
    //enum Color{silver, red, blue, black, white}
    private String make;
    private String model;
    private String color;
    private int licenseNumber;
    private int timeParked;
    
    public ParkedCar(String make, String model, String color, int number, int time){
        //CarMake aMake, CarModel aModel, Color aColor, 
        this.make = make;
        this.model = model;
        this.color = color;
        licenseNumber = number;
        timeParked = time;
    }
    
    public ParkedCar(ParkedCar car){
        //this.make = car.make;
       // this.model = car.model;
        //this.color = car.color;
        this.licenseNumber = car.licenseNumber;
        this.timeParked = car.timeParked;
    }
    /*public CarMake getMake(){
        return make;
    }
    public CarModel getModel(){
        return model;
    }
    public Color getColor(){
        return color;
    }
    public int getLicenseNumber(){
        return licenseNumber;
    }*/
    public int getTimeParked(){
        return timeParked;
    }
    @Override
    public String toString(){
        String str = //"Car Make: " + make +
                     //"\nCar Model: " + model +
                     //"\nCar color: " + color +
                     "\nDriver's License Number: " +licenseNumber;
        return str;
    }
}
