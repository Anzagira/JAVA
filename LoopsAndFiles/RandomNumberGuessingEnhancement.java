/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopsAndFiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LAB Student
 */
public class RandomNumberGuessingEnhancement {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random number = new Random();
        int value = number.nextInt(10);
        System.out.print("Guess the number: ");
        int guess = keyboard.nextInt();
        int count = 1;
        
        while (value != guess){
            if (guess > value)
                System.out.println("Too High, try again");
            else
                System.out.println("Too Low, try again");
            count++;
            System.out.print("Guess the number: ");
            guess = keyboard.nextInt();
        }
        System.out.println("Number of Guesses: " + count);        
    }
}
