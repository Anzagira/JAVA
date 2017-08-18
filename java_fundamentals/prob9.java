/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_fundamentals;
import java.util.Scanner;
/**
 *
 * @author LAB Student
 */
public class prob9 {
    public static void main(String[] args){
        
        float miles, gallons;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Please enter the number of miles driven and gallons of gas");
        miles = keyboard.nextFloat();
        gallons = keyboard.nextFloat();
        
        System.out.println("MPG of car is " + miles/gallons);
       
        
    }
}
