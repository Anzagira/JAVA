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
public class AreaClass {
    //private double radius;
    //private double height;
    
    //public void setRadius(double rad){
    //    radius = rad;
    //}
    //public void setHeight(double high){
    //    height = high;
    //}
    public static double area(double radius){
        return Math.PI * Math.pow(radius, 2);        
    }
    public static double area(double width, double length){
        return width * length;
    }
    public static double area(double radius, int height){
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
