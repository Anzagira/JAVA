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
public class Payroll {
    private String employeeName;
    private int idNumber;
    private double hourlyPayRate;
    private float numberOfHours;
    
    public void setHourlyPayRate(double rate){
        hourlyPayRate = rate;
    }
    
    public void setNumberOfHours(float hours){
        numberOfHours = hours;
    }
    
    Payroll(String name, int id){
        employeeName = name;
        idNumber = id;
    }
    
    public double getGrossPay(){
        return hourlyPayRate * numberOfHours;
    }
}
