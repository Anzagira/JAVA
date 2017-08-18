/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondLookAtClassesAndObjects;

import java.text.DecimalFormat;

/**
 *
 * @author LAB Student
 */
public class PoliceOfficer {
    private String officerName;
    private int badgeNumber;
    private ParkedCar car;
    //private ParkingMeter reading;
    //private ParkingTicket ticket;
    
    public PoliceOfficer(PoliceOfficer officer){
        this.badgeNumber = officer.badgeNumber;
        //this.car = officer.car;
        this.officerName = officer.officerName;
        //this.reading = officer.reading;
       //this.ticket = officer.ticket;
    }
    public PoliceOfficer(String name, int number){
        officerName = name;
        badgeNumber = number;
       // car = new ParkedCar(car1);
       // reading = new ParkingMeter(reading1);
        
    }
    public ParkingTicket patrol(ParkedCar car, ParkingMeter reading){
        ParkingTicket ticket = null;
        int timeExceeded = car.getTimeParked() - reading.getTimePurchased();
        if(timeExceeded > 0){
            ticket = new ParkingTicket(car, this, timeExceeded);
        }
        return ticket;
    }
    //public int getTime(){
     //  int timeExceeded = 0;
      //  if(car.getTimeParked() > reading.getTimePurchased())
            
     //   return timeExceeded;
    //}
    @Override
    public String toString(){
        String str = " Officer's Name: " + officerName +
                     "\nBadge Number: " + badgeNumber;
        return str;
    }
    //public String issueTicket(){
    //    return ticket.tostring();
   // } 
    
  
}
