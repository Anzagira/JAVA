/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopsAndFiles;

/**
 *
 * @author LAB Student
 */
public class DistanceTraveled {
    private double speedOfVehicle;
    private int numberOfHours;
    public void setSpeedOfVehicle(double speed){
        speedOfVehicle = speed;
    }
    public void setNumberOfHOurs(int hours){
        numberOfHours = hours;
    }
    
    public double getDistance(){
        return speedOfVehicle * numberOfHours;
    }
}
