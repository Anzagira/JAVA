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
public class SpeedOfSound {
    private double distance;
    
    public void setDistance(double dist){
        distance = dist;
    }
    
    public double getSpeedInAir(){
        return distance / 1100;
    }
    
    public double getSpeedInWater(){
        return distance / 4900;
    }
    
    public double getSpeedInSteel(){
        return distance / 16400;
    }  
}
