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
public class CarInfo {
    public static void main(String[] args){
        Car volvo = new Car(2007, "S40");
        
        volvo.accelerate();
        System.out.println("Speed: " +volvo.getSpeed());
        volvo.accelerate();
        System.out.println("Speed: " +volvo.getSpeed());
        volvo.accelerate();
        System.out.println("Speed: " +volvo.getSpeed());
        volvo.accelerate();
        System.out.println("Speed: " +volvo.getSpeed());
        volvo.accelerate();
        System.out.println("Speed: " +volvo.getSpeed());
        
        volvo.brake();
        System.out.println("Speed: " +volvo.getSpeed());
        volvo.brake();
        System.out.println("Speed: " +volvo.getSpeed());
        volvo.brake();
        System.out.println("Speed: " +volvo.getSpeed());
        volvo.brake();
        System.out.println("Speed: " +volvo.getSpeed());
        volvo.brake();
        System.out.println("Speed: " +volvo.getSpeed());
    }
    
}
