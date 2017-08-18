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
public class prob16 {
    public static void main(String[] args){
        
    String name, city, college, profession, animalType, petName;
    int age;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter your name: ");
    name = keyboard.nextLine();
    System.out.print("Enter the name of your city: ");
    city = keyboard.nextLine();
    System.out.print("Enter the name of your college: ");
    college = keyboard.nextLine();
    System.out.print("Enter your profession: ");
    profession = keyboard.nextLine();
    System.out.print("Enter your animal's type: ");
    animalType = keyboard.nextLine();
    System.out.print("Enter your pet's name: ");
    petName = keyboard.nextLine();
    System.out.print("Enter your age: ");
    age = keyboard.nextInt();
    
    System.out.println("There once was a person named " + name +" who lived in " + 
                       city + ". At the age of " + age + ",\n" + name + " went to college at " + 
                       college + ". " + name + " graduate and went to work as a \n" + profession + 
                       ". Then, " + name + " adopted a(n)" + animalType + " named " + petName + 
                       ". They both lived \n happily ever after!");                    
                         
    }    
}
