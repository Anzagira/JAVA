/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** Methods for the String class include:
 *      StringObject.toUpperCase() - Converts all characters to Upper case
 *      StringObject.toLowerCase() - Converts all characters to Lower case
 *      StringObject.charAt(index) - Returns the character at the index specified within the string
 *      StringObject.length() - Returns the length of the string 
 */
package java_fundamentals;
import java.util.Scanner;
/**
 *
 * @author LAB Student
 */
public class prob12 {
    public static void main(String[] args) {
        
        String favoriteCity;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the name of your Favorite City: ");
        favoriteCity = keyboard.nextLine();
        
        System.out.println("Number of Characters: " + favoriteCity.length() +
                         "\n Name of city in all uppercase letters: " + favoriteCity.toUpperCase() + 
                         "\n Name of City in all lowercse letters: " + favoriteCity.toLowerCase() + 
                         "\n First Character in the name of City: " + favoriteCity.charAt(0));
    }
}
