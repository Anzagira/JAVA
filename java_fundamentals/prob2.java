/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_fundamentals;

/**
 *
 * @author LAB Student
 */
public class prob2 {
    
    public static void main(String[] args) {
        
        String firstName, middleName, lastName;
        char firstInitial, middleInitial, lastInitial;

        firstName = "Allan";
        middleName = "Zelekye";
        lastName = "Anzagira";

        firstInitial = firstName.charAt(0);
        middleInitial = middleName.charAt(0);
        lastInitial = lastName.charAt(0);
    
        System.out.print("First: " + firstInitial +
                         "\n Middle: " + middleInitial +
                         "\n Last: " + lastInitial);
    }
    
          
            
            
}
