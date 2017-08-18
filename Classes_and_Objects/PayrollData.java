/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_and_Objects;
import java.util.Scanner;
/**
 *
 * @author LAB Student
 */
public class PayrollData {
    public static void main(String[] args){
        Payroll employee1 = new Payroll("Nadew Kibret", 01);
        double rate;
        float hours;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the information for Nadew Kibret");
        System.out.print("Hourly Rate: ");
        rate = keyboard.nextDouble();
        System.out.print("Number of Hours: ");
        hours = keyboard.nextFloat();
        employee1.setHourlyPayRate(rate);
        employee1.setNumberOfHours(hours);
        
        System.out.println("Nadew Kibret's Gross Pay is: " + employee1.getGrossPay());
    }
}
