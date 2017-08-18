/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndArrayLists;
import java.util.Scanner;
/**
 *
 * @author Allan
 */
public class Rainfall {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        
        final int arr_size = 12;
        double[] rain = new double[arr_size];
        for(int i = 0; i < arr_size; i++){
            System.out.printf("Please enter the quantity of rain for month %d: ", i+1);
            double amt = keyboard.nextDouble();
            while (amt < 0.0){
                System.out.println("Quantity of rainfall cannot be negative"); 
                System.out.print("Please enter the quantity of rain for month again: ");
                amt = keyboard.nextDouble();
            }
            rain[i] = amt;
        }
        System.out.println("Total Rainfall is: " + getTotalRainfall(rain));
        System.out.println("Average Monthly Rainfall is: " + getAvMonRainfall(rain));
        System.out.println("Month with Lowest Rainfall is: " + getLowestMonth(rain));
        System.out.println("Month with Highest Rainfall is: " + getHighestMonth(rain));
        }
        public static double getTotalRainfall(double[] rain){
            double totalRain = 0;
            for(int i = 0; i < rain.length; i++){
                totalRain += rain[i];
            }
            return totalRain;
        }
        public static double getAvMonRainfall(double[] rain){
            double totalRain = 0;
            for(int i = 0; i < rain.length; i++){
                totalRain += rain[i];
            }
            return totalRain / rain.length;
        }
        public static int getLowestMonth(double[] rain){
            double lowest = rain[0];
            for(int i = 0; i < rain.length; i++){
                if(rain[i] < lowest)
                    lowest = rain[i];
            }
            int month = 0;
            for(int i=0; i < rain.length; i++){
                if(rain[i] == lowest){
                    month = i;
                }
             }
            return month + 1;
        }
        public static int getHighestMonth(double[] rain){
            double highest = rain[0];
            for(int i = 0; i < rain.length; i++){
                if(rain[i] > highest)
                    highest = rain[i];
            }
            int month = 0;
            for(int i=0; i < rain.length; i++){
                if(rain[i] == highest){
                    month = i;
                }
             }
            return month + 1;
        }
    
}
