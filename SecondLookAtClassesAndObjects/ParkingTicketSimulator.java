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
public class ParkingTicketSimulator {
    public static void main(String[] args){
        ParkedCar nadew = new ParkedCar("Volvo", "s40", "silver", 32592865, 180);
        ParkingMeter reading = new ParkingMeter(75);
        PoliceOfficer allan = new PoliceOfficer("David", 234);
        ParkingTicket ticket = allan.patrol(nadew, reading);
        if(ticket != null){
            System.out.println(ticket);
        }
        else
            System.out.println("No Crimes committed");
    }
}
