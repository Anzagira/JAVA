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
public class Geometry {
    private static double radius;
    private static int length;
    private static int width;
    private static double base;
    private static double height;
    
    public static double getArea(double rad){
        radius = rad;
        double area = 0;
        if(radius < 0)
            System.out.println("Error: Raduis must be positive");
        else
            area = Math.PI *Math.pow(rad, 2);
        return area;
    }
    public static int getArea(int len, int wid){
        length = len;
        width = wid;
        int area = 0;
        if(length < 0 || width < 0)
            System.out.println("Error: Length and Width must be positive");
        else
            area = length * width;
        return area;
    }
    public static double getArea(double bas, double high){
        base = bas;
        height = high;
        double area = 0;
        if(base < 0 || height < 0)
            System.out.println("Error: Raduis must be positive");
        else
            area = base * height * 0.5;
        return area;
    }
    
}
