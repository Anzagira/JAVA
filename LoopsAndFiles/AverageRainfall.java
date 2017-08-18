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
public class AverageRainfall {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of years: ");
        int years = keyboard.nextInt();
        int monthCount=0;
        double totalInches = 0;
        while (years > 0){
            for (int i = 1; i < years + 1; i++){
                for(int j = 1; j < 13; j++){
                    System.out.printf("Please enter the inches of rainfall for month %d for year %d: ",j,i);
                    double inches = keyboard.nextDouble();
                    monthCount++;
                    totalInches += inches;
                }
            System.out.println("Number of months: " + monthCount + "\n" +
                               "Total Inches of Rainfall: " + totalInches + "\n" +
                               "Average Rainfall per Month: " + totalInches/monthCount);
            System.out.print("Please enter the number of years: ");
            years = keyboard.nextInt();
            }
        }
    }
}
