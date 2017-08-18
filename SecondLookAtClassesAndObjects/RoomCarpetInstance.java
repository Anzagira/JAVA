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
public class RoomCarpetInstance {
    public static void main(String[] args){
        RoomDimension upark = new RoomDimension();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the length of the room: ");
        double length = keyboard.nextDouble();
        upark.setRoomLength(length);
        System.out.print("Please enter the width of the room: ");
        double width = keyboard.nextDouble();
        upark.setRoomWidth(width);
        RoomCarpet carp = new RoomCarpet(0.0, upark);
        System.out.print("Please enter the cost of the room per Square Foot: ");
        double cost= keyboard.nextDouble();
        carp.setCarpetCost(cost);
        System.out.println("Here are the details\n" + carp +
                           "\nTotal Cost of Carpet: " + carp.getTotalCost());
        
        //System.out.println(carp.getDimension());
    }
}
