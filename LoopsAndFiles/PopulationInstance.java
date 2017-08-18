/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopsAndFiles;
import java.util.Scanner;
/**
 *
 * @author LAB Student
 */
public class PopulationInstance {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Population rabbits = new Population();
        System.out.print("Please enter the starting size of the Population greater than 2: ");
        int num = keyboard.nextInt();
        System.out.print("Please enter the positive average daily Population increase: ");
        double increase = keyboard.nextDouble();
        System.out.print("Please enter the positive number of days: ");
        int days = keyboard.nextInt();
        while (num > 1 && increase > 0 && days > 0){
            rabbits.setStartingNumber(num);
            //System.out.print("Please enter the positive average daily Population increase: ");
             //increase = keyboard.nextDouble();
            //while (increase > 0){
            rabbits.setPercentIncrease(increase);
                //System.out.print("Please enter the positive number of days: ");
               // days = keyboard.nextInt();
                //while (days > 0){
            rabbits.setNumberOfDays(days);
            rabbits.getPopulation();              
            System.out.print("Please enter the starting size of the Population greater than 2: ");
            num = keyboard.nextInt();
            System.out.print("Please enter the positive average daily Population increase: ");
            increase = keyboard.nextDouble();   
            System.out.print("Please enter the positive number of days: ");
            days = keyboard.nextInt();
        }
    }
}
