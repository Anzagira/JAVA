/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionStructures;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author LAB Student
 */
public class BodyMassIndex {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your weight in pounds: ");
        float weight = keyboard.nextFloat();
        System.out.print("Please enter your height in inches: ");
        int height = keyboard.nextInt();
        double BMI = (double) weight * 703 / Math.pow(height, 2);
        
        if (BMI < 18.5){
            //JOptionPane.showMessageDialog(null, "You are Underweight");
            System.out.println("You are Underweight");
        }
        else if(BMI > 25){
            //JOptionPane.showMessageDialog(null, "You are Overweight");
            System.out.println("You are Overweight");
        }
        else
            //JOptionPane.showMessageDialog(null, "Your weight is Optimal");
            System.out.println("You weight is Optimal");
    }
}
