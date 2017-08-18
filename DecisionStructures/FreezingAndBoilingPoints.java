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
public class FreezingAndBoilingPoints {
    private int temperature;
    
    public void setTemperature(int temp){
        temperature = temp;
    }
    
    public void isEthylFreezing(){
        if (temperature < -173)
            System.out.println("Ethyl will Freeze");
    }
    
    public void isOxygenFreezing(){
        if (temperature < -362)
            System.out.println("Oxygen will Freeze");
    }
    
    public void isWaterFreezing(){
        if (temperature < 32)
            System.out.println("Water will Freeze");
    }
    
    public void isEthylBoiling(){
        if (temperature > 172)
            System.out.println("Ethyl will boil");
    }

    public void isOxygenBoiling(){
        if (temperature > -306)
            System.out.println("Oxygen will boil");
    }   
    
    public void isWaterBoiling(){
        if (temperature > 212)
            System.out.println("Water will boil");
    }
}
