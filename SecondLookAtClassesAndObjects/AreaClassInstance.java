/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondLookAtClassesAndObjects;

/**
 *
 * @author LAB Student
 */
public class AreaClassInstance {
    public static void main(String[] args){
        System.out.println("Area of circle of radius 14 is: " + AreaClass.area(14.0));
        System.out.println("Area of rectangle of length 14 and width 14 is: " + AreaClass.area(14.0, 14.0));
        System.out.println("Area of cylinder of radius 14 and height 2.1 is: " + AreaClass.area(14.0, 2));
    }
}
