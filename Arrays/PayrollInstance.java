/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndArrayLists;
import java.util.Scanner;
/**
 *
 * @author Allan
 */
public class PayrollInstance {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Payroll NIA = new Payroll();
        int[] time = new int[7];
        double[] rate = new double[7];
       
        
        for(int i = 0; i < 7; i++){
            System.out.println(NIA.getEmployeeId(i));
            System.out.print("Please enter the number of hours for the employee: ");
            int num = keyboard.nextInt();
            while (num < 0){
                System.out.print("Please enter positive number of hours for the employee: ");
                num = keyboard.nextInt();
            }
            System.out.print("Please enter the hourly rate for the employee: ");
            double pay = keyboard.nextDouble();
            while (pay < 6.0){
                System.out.print("Please enter hourly payrate for the employee > 6.0: ");
                pay = keyboard.nextDouble();
            }
            time[i] = num;
            rate[i] = pay;        
        }
        NIA.setHours(time);
        NIA.setPayRate(rate);
        NIA.setWages();
        System.out.println("Here are the Wages for all 7 Employees ");
        for(int i = 0; i < 7; i++){
            System.out.println("Employee " + NIA.getEmployeeId(i) + " gets $" +
                               NIA.getGrossPay(NIA.getEmployeeId(i)));
        }
    }
}
