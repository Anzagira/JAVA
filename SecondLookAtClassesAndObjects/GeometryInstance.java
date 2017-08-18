/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondLookAtClassesAndObjects;
import java.util.Scanner;
/**
 *
 * @author LAB Student
 */
public class GeometryInstance {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //Geometry figure = new Geometry();
        System.out.println("Geometry Calculator\n" +
                           "1. Calculate the Area of a Circle\n" +
                           "2. Calculate the Area of a Rectangle\n" +
                           "3. Calculate the Area of a Triangle\n" +
                           "4. Quit\n");
        System.out.print("\nEnter your choice (1 - 4): ");
        int ans = keyboard.nextInt();
        switch(ans){
            case 1:
                System.out.print("Please enter the radius of the circle: ");
                double rad = keyboard.nextDouble();
                System.out.println("Circle: " +Geometry.getArea(rad));
                break;
            case 2:
                System.out.println("Please enter the length and width of the rectangle");
                System.out.print("Length: ");
                int len = keyboard.nextInt();
                System.out.print("Width: ");
                int wid = keyboard.nextInt();
                System.out.println("Rectangle: " +Geometry.getArea(len, wid));
                break;
            case 3:
                System.out.println("Please enter the base and height of the triangle");
                System.out.print("Base: ");
                double bas = keyboard.nextDouble();
                System.out.print("Height: ");
                double high = keyboard.nextDouble();
                System.out.println("Triangle: " +Geometry.getArea(bas, high));
                break;
            case 4:
                break;  
            default:
                System.out.println("Error: Number is outside of 1 - 4");
                break;
        }
    }
}
