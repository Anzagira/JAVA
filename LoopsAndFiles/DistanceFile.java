/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopsAndFiles;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author LAB Student
 */
public class DistanceFile {
    public static void main(String[] args) throws IOException{
        File distFile = new File("C:/Users/Lab Student/Desktop/journey.txt");
        PrintWriter outFile = new PrintWriter(distFile);
        DistanceTraveled traveler = new DistanceTraveled();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of hours: ");
        int hours = keyboard.nextInt();
        System.out.print("Please enter the speed of the vehicle: ");
        double speed = keyboard.nextDouble();
        while (speed >= 0 && hours >0){            
            traveler.setSpeedOfVehicle(speed);
            outFile.println("Hour\t\t\t\tDistance Traveled");
            outFile.println("-------------------------------------------------");
            for (int i = 1; i < hours + 1; i++){
                traveler.setNumberOfHOurs(i);
                outFile.println(i + "\t\t\t\t\t" + traveler.getDistance());                
            }
            System.out.print("Please enter the number of hours: ");
            hours = keyboard.nextInt();
            System.out.print("Please enter the speed of the vehicle: ");
            speed = keyboard.nextDouble();
        }
        outFile.close();
    }
}
