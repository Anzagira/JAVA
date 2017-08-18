/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_fundamentals;

import java.util.Scanner;
/**
 *
 * @author LAB Student
 */
public class prob11 {
    public static void main(String[] args) {
        double retailPrice;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the retail price of the board: ");
        retailPrice = keyboard.nextDouble();
        System.out.println("Profit is " + retailPrice * 0.4);
        
    }
}
