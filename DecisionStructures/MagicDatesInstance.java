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
public class MagicDatesInstance {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the month as an integer: ");
        int months = keyboard.nextInt();
        System.out.print("Please enter the day as an integer: ");
        int days = keyboard.nextInt();
        System.out.print("Please enter the year as a two-digit integer: ");
        int years = keyboard.nextInt();
        MagicDates season = new MagicDates(days, months, years);
        season.isMagic();
        
        
    }
}
