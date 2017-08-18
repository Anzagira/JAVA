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
public class BarChart {
    /*public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        for(int i = 1; i < 6; i++){
            System.out.printf("Enter today's sales for store %d: $", i);
            int sales = keyboard.nextInt();
            System.out.printf("Store %d:", i);
            if (sales < 100)
                System.out.println("Sales must be above $100");
            else
                for(int j = 0; j < sales; j +=100){
                    System.out.print("*");
                }
            System.out.print("\n");
        }
    }*/
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter today's sales for store 1: $");
            int sales1 = keyboard.nextInt();
            System.out.print("Enter today's sales for store 2: $");
            int sales2 = keyboard.nextInt();
            System.out.print("Enter today's sales for store 3: $");
            int sales3 = keyboard.nextInt();
            System.out.print("Enter today's sales for store 4: $");
            int sales4 = keyboard.nextInt();
            System.out.print("Enter today's sales for store 5: $");
            int sales5 = keyboard.nextInt();
            System.out.println("SALES BAR CHART");
            for(int j = 0; j < sales1; j +=100){
                System.out.print("*");
            }
            System.out.print("\n");
            for(int j = 0; j < sales2; j +=100){
                System.out.print("*");
            }
            System.out.print("\n");
            for(int j = 0; j < sales3; j +=100){
                System.out.print("*");
            }
            System.out.print("\n");
            for(int j = 0; j < sales4; j +=100){
                System.out.print("*");
            }
            System.out.print("\n");
            for(int j = 0; j < sales5; j +=100){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    
}
