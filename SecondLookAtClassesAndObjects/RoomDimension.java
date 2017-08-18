/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondLookAtClassesAndObjects;

/**
 *Note that for Aggregation, the Part class needs a copy constructor to enable the whole class access the object of the part class. 
 * An additional constructor (preferably no-args constructor) is needed to enable the instantiation of the part class object in the implementation
 * @author LAB Student
 */
public class RoomDimension {
    private double roomLength;
    private double roomWidth;
    
    public RoomDimension(){
        roomLength = 0.0;
        roomWidth = 0.0;
    }
    public void setRoomLength(double length){
        roomLength = length;
    }
    public void setRoomWidth(double width){
        roomWidth = width;
    }
    public RoomDimension(RoomDimension room){
        roomWidth = room.roomWidth;
        roomLength = room.roomLength;
    }
    public double getRoomArea(){
        return roomLength * roomWidth;        
    }
    public String toString(){
        String roomDetails = "Room Length: " + roomLength +
                             "\nRoom Width: " + roomWidth;
        return roomDetails;
    }
    
}
