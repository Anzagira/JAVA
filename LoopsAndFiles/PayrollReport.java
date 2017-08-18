/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopsAndFiles;

/**
 *
 * @author LAB Student
 */
public class PayrollReport {
   private int idNumber;
   private double grossPay;
   private double stateTax;
   private double federalTax;
   private double ficaWithholdings;
   public void setIdNumber(int id){
       idNumber = id;
   }
   public void setGrossPay(double pay){
       grossPay = pay;
   }
   public void setStateTax(double state){
       stateTax = state;
   }
   public void setFederalTax(double fed){
       federalTax = fed;
   }
   public void setFicaWithholdings(double fica){
       ficaWithholdings = fica;
   }
   public double getNetPay(){
       return grossPay - stateTax - federalTax - ficaWithholdings;
   }
}

