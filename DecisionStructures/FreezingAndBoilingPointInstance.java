/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionStructures;
import java.util.Scanner;
/**
 *
 * @author LAB Student
 */
public class FreezingAndBoilingPointInstance {
    public static void main(String[] args){
        FreezingAndBoilingPoints substances = new FreezingAndBoilingPoints();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the temperature: ");
        int temp = keyboard.nextInt();
        substances.setTemperature(temp);
        
        System.out.printf("If the temperature is %d; \n", temp);
        substances.isEthylFreezing();
        substances.isEthylBoiling();
        substances.isOxygenFreezing();
        substances.isOxygenBoiling();
        substances.isWaterFreezing();
        substances.isWaterBoiling();
    }
}
