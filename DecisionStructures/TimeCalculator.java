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
public class TimeCalculator {
        public static void main(String[] args){
        System.out.print("Please enter number of seconds: ");
        Scanner keyboard = new Scanner(System.in);
        long seconds = keyboard.nextLong();
        
        long minutes, hours, days;
        
        if (seconds >= 86400){
            days = seconds/86400;
            System.out.println(days + " Days");
        }
        else if(seconds <=86400 && seconds >= 3600){
            hours = seconds/3600;
            System.out.println(hours + " hours");
        }
        else if(seconds <=3600 && seconds >= 60){
            minutes = seconds/60;
            System.out.println(minutes + " Minutes");
        }
        else{
            System.out.println(seconds + " Seconds");
        }
        
        
       
}
}
