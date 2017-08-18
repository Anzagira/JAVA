/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_and_Objects;

/**
 *
 * @author LAB Student
 */
public class Circle {
    private double radius;
    private final double PI = 3.14159;
    
    public void setRadius(double rad){
        radius = rad;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getArea(){
        return PI * radius * radius; 
    }
    
    public double getDiameter(){
        return radius * 2;
    }
    
    public double getCircumference(){
        return 2 * PI *radius;
    }
    
    public Circle(double rad){
        radius = rad;
    }   
}
