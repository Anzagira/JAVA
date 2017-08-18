/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopsAndFiles;
import java.util.Scanner;
/**
 *
 * @author LAB Student
 */
public class HotelOccupancy {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of floors: ");
        int numberOfFloors = keyboard.nextInt();
        int numberOfRooms = 10;
        while (numberOfFloors > 0 && numberOfRooms > 9){
            int totalRooms = 0;
            int totalOccupied = 0;
            for (int i = 0; i < numberOfFloors; i++){
                System.out.printf("Please enter the number of rooms on floor %d: ", i);
                numberOfRooms = keyboard.nextInt();
                totalRooms += numberOfRooms ;
                System.out.print("Please enter the number of rooms occupied: ");
                int roomsOccupied = keyboard.nextInt();
                totalOccupied += roomsOccupied;
                }
            System.out.println("Number of Rooms in Hotel: " + totalRooms + "\n" +
                               "Number that are occupied: " + totalOccupied + "\n" +
                               "Number that are vacant: " + (totalRooms - totalOccupied));
            System.out.print("Please enter the number of floors: ");
            numberOfFloors = keyboard.nextInt();
        
    }
}
}