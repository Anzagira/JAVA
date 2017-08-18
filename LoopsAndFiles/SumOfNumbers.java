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
public class SumOfNumbers {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a positive non-zero number or 0 to end: ");
        int n = keyboard.nextInt();
        while (n > 0){
            int total = 0;
            for (int i = 1; i < n+1; i++){
                total += i; 
            }
            System.out.printf("Sum of numbers from 1 to %d is: ", n);
            System.out.print(total + "\n");
            System.out.print("Enter a positive non-zero number or 0 to end: ");
            n = keyboard.nextInt();
        }
    }

}
