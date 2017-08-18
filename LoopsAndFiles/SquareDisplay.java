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
public class SquareDisplay {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a number less than 16: ");
        int number = keyboard.nextInt();
        while (number > 0 && number < 16){
            for(int i = 0; i < number; i++){
                for(int j = 0; j < number; j++){
                    System.out.print("x");
                }
                System.out.print("\n");
            }
            System.out.print("Please enter a number less than 16: ");
            number = keyboard.nextInt();
            
        }
    }
}
