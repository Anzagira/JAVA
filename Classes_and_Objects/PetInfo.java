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
public class PetInfo {
    public static void main(String[] args){
        Pet dee = new Pet();
        String nom;
        String typ;
        int years;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the name, type and age of your pet");
        System.out.print("Name: ");
        nom = keyboard.nextLine();
        dee.setName(nom);
        System.out.print("Type: ");
        typ = keyboard.nextLine();
        dee.setType(typ);
        System.out.print("Age: ");
        years = keyboard.nextInt();
        dee.setAge(years);
        
        System.out.println("Pet info is as follows;" + 
                           "\nName: " + dee.getName() + 
                           "\nType: " + dee.getType() + 
                           " \nAge: " + dee.getAge());
    }
}
