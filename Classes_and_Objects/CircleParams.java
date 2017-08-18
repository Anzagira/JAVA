/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_and_Objects;
import java.util.Scanner;
/**
 *
 * @author LAB Student
 */
public class CircleParams {
    public static void main(String[] args){
        Circle round = new Circle(2.8);
        double rad;
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Please enter the radius of the circle: ");
        rad = keyboard.nextDouble();
        round.setRadius(rad);
        
        System.out.println("Circle Parameters are given as follows;" + 
                           "\nArea: " + round.getArea() + 
                           "\nDiameter: " + round.getDiameter() +
                           "\nCircumference: " + round.getCircumference());
    }
}
