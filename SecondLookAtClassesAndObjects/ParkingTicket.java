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
public class ParkingTicket {
    private ParkedCar car;
    private PoliceOfficer officer;
    int timePast;
    double amount;
    //private int ticketAmount;
    //rivate int timeExceeded;
    
    public ParkingTicket(ParkedCar car1, PoliceOfficer officer1, int minutes ){
        car = new ParkedCar(car1);
        officer = new PoliceOfficer(officer1);
        timePast = minutes;
    }
    //public void setOfficer(){
        
        //ticketAmount = amount;
        //timeExceeded = officer.getTime();
    //}
    public ParkingTicket(ParkingTicket ticket){
        this.car = ticket.car;
        this.officer = ticket.officer;
        //this.ticketAmount = ticket.ticketAmount;
    }
    public double getTicketAmount(){
        if(timePast <= 60)
               amount = 25;
        else 
            if((timePast - 60) % 60 != 0)
                amount = 25 + (((timePast - 60) / 60)*10) + 10;
            else
                amount = 25 + (((timePast - 60) / 60)*10);
        return amount;
        }
    
    public String toString(){
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        String str = "Car Details " + car.toString() +
                     "\nDetails of Officer issuing ticket\n" + officer.toString() +
                     "\nMinutes Exceeded: " + timePast +
                     "\nTicket Due is $" + dollar.format(this.getTicketAmount());
        return str;
        }
            
    
}    

