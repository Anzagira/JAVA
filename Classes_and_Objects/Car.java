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
public class Car {
    private int yearModel;
    private String make;
    private int speed;
    
    public Car(int model, String brand){
        yearModel = model;
        make = brand;
        speed = 0;
    }
    public int getModel(){
        return yearModel;
    }
    
    public String getMake(){
        return make;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void accelerate(){
        speed+=5;            
    }
    
    public void brake(){
        speed-=5;
    }
}
