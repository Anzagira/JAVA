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
public class RoomCarpet {  
    private double carpetCost;
    private RoomDimension size;
    
    public RoomCarpet(double cost, RoomDimension dim){
    size = new RoomDimension(dim);
    carpetCost = cost;
    }
    public void setCarpetCost(double cost){
        carpetCost = cost;
    }
    
    /*public RoomDimension getDimension(){
        return new RoomDimension(size);
    }*/
//Another way of returning the content of RoomDimension class object from the toString method 
    
    public double getTotalCost(){
        return carpetCost * size.getRoomArea();
    }
    public String toString(){
        String carpet = "Room Details\n" + size +
                        "\nCost Per Square Foot: " + carpetCost;
        return carpet;
    }
}
