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
public class SpeedOfSoundInstance {
    public static void main(String[] args){
        SpeedOfSound soundz = new SpeedOfSound();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please select a medium: air, water or steel: ");
        String medium = keyboard.nextLine();
        switch (medium){
            case "air":
                System.out.print("Please enter the distance traveled: ");
                double dist = keyboard.nextDouble();
                soundz.setDistance(dist);
                System.out.println("Time taken is " + soundz.getSpeedInAir() + "secs.");
                break;

            case "water":
                System.out.print("Please enter the distance traveled: ");
                dist = keyboard.nextDouble();
                soundz.setDistance(dist);
                System.out.println("Time taken is " + soundz.getSpeedInWater() + "secs.");  
                break;

            case "steel":
                System.out.print("Please enter the distance traveled: ");
                dist = keyboard.nextDouble();
                soundz.setDistance(dist);
                System.out.println("Time taken is " + soundz.getSpeedInSteel() + "secs.");
                break;
                
            default:
                System.out.println("Please select one of the available choices");
                break;
        }
    }
    
}
