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
public class PayrollInstance {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        PayrollReport nadew = new PayrollReport();
        System.out.print("Please enter the Employee ID: ");
        int id = keyboard.nextInt();
        nadew.setIdNumber(id);
        double pay, state, fed, fica;
        double totalGross =0;
        double totalState = 0;
        double totalFed = 0;
        double totalFica = 0;
        double totalNetPay = 0;
        while (id > 0){
            System.out.print("Please enter the Gross Pay: ");
            pay = keyboard.nextDouble();
            nadew.setGrossPay(pay);
            System.out.print("Please enter the State Tax: ");
            state = keyboard.nextDouble();
            nadew.setStateTax(state);
            System.out.print("Please enter the Federal Tax: ");
            fed = keyboard.nextDouble();
            nadew.setFederalTax(fed);
            System.out.print("Please enter the FICA Withholdings: ");
            fica = keyboard.nextDouble();
            nadew.setFicaWithholdings(fica);
            while (pay > state && pay > fed && pay > fica){
                if(state + fed + fica > pay){
                    System.out.printf("Error. Please reenter the data for Employee %d\n", id);
                    System.out.print("Gross Pay: ");
                    pay = keyboard.nextDouble();
                    System.out.print("State Tax: ");
                    state = keyboard.nextDouble();
                    System.out.print("Federal Tax: ");
                    fed = keyboard.nextDouble();
                    System.out.print("Fica Withholdings: ");
                    fica = keyboard.nextDouble();
                }
                System.out.printf("Net Pay for employee %d is:", id);
                System.out.print(nadew.getNetPay() + "\n");
                totalGross += pay;
                totalState += state;
                totalFed += fed;
                totalFica += fica;
                totalNetPay += nadew.getNetPay();
                pay = 0; 
            }
            System.out.print("Please enter another Employee ID; ");
            id = keyboard.nextInt();
            
        }
        System.out.println("Total for all employees is given as follows;\n" +
                               "Total Gross Pay: " + totalGross + "\n" +
                               "Total NetPay: " + totalNetPay + "\n" +
                               "Total State Tax: " + totalState + "\n" +
                               "Total Federal Tax: " + totalFed + "\n" +
                               "Total FICA Withholdings: " + totalFica);
    }
}
