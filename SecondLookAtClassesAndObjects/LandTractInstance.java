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
public class LandTractInstance {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        LandTract park = new LandTract();
        System.out.print("Please enter the dimensions of the First Land\n" +
                         "Length: ");
        int len = keyboard.nextInt();
        System.out.print("Width: ");
        int wid = keyboard.nextInt();
        park.setTractLength(len);
        park.setTractWidth(wid);
        
        LandTract lot = new LandTract();
        System.out.print("Please enter the dimensions of the Second Land\n" +
                         "Length: ");
        int len1 = keyboard.nextInt();
        System.out.print("Width: ");
        int wid1 = keyboard.nextInt();
        lot.setTractLength(len1);
        lot.setTractWidth(wid1);
        
        System.out.println("Land Details\n " + park + "\n" + lot +
                           "\n" + "Area of First Land: " + park.getArea() +
                           "\n" + "Area of Second Land: " + lot.getArea());
        
        if (park.equalsTo(lot))
            System.out.println("Tracts are the of equal size");
        else
            System.out.println("Tracts are of different sizes");              
    }
}
