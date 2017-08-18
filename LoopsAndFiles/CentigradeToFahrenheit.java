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
public class CentigradeToFahrenheit {
    public static void main(String[] args){
        double fahrenheit; 
        int celcius;
        System.out.println("Centrigrade \t\t\t Fahrenheit");
        System.out.println("-------------------------------------------------");
        for(celcius = 0; celcius < 21; celcius++){
            fahrenheit = (1.80) * celcius + 32;
            System.out.println(celcius + "\t\t\t\t" + fahrenheit);
        }
        
    }
}
