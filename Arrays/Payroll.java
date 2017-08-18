/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndArrayLists;

/**
 *
 * @author Allan
 */
public class Payroll {
    private final double[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int[] hours = new int[7];
    private double[] payRate = new double[7];
    private double[] wages = new double[7];
    
    public double getEmployeeId(int index){
        return employeeId[index];
    }
    public void setPayRate(double[] rate){
        payRate = rate;
    }
    
    public void setHours(int[] time){
        hours = time;
    }
    public void setWages(){
        for(int i = 0; i < employeeId.length; i++){
            wages[i] = payRate[i] * hours[i];
        }
    }
    
    public double getGrossPay(double id){
        double grossPay = 0;
        for(int i = 0; i < employeeId.length; i++){
            if(employeeId[i] == id)
                grossPay = wages[i];
        }
        return grossPay;  
    }
}
    

