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
public class prob3 {
    public static void main(String[] args) {
        
    String name, city, state, major;
    int ZIP; 
    long telephone;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter your name: ");
    name = keyboard.nextLine();
    System.out.print("Enter your address with city, state and ZIP: ");
    city = keyboard.nextLine();
    state = keyboard.nextLine();
    ZIP = keyboard.nextInt();
    System.out.print("Enter your telephone number: ");
    telephone = keyboard.nextLong();
    System.out.print("Enter your college major: ");
    major = keyboard.next();
    
    System.out.println("Name: " + name +"\n Address: " + city + ", " + state + " " + ZIP + "\n Telephone number: " + 
                       telephone + "\n College Major: " + major);                    
                         
     }
}
