/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// The Scanner Object keyboard is used to accept input from user which is then stored in the variables of testScore.
// Scanner method .nextInt() accepts integer as input, nextFloat() accepts float, nextByte(), and so on
// Note that .nextLine accepts String as input
package java_fundamentals;

import java.util.Scanner;

/**
 *
 * @author LAB Student
 */
public class prob10 {
         public static void main(String[] args) {
     
        float testScore1, testScore2, testScore3;
         
         Scanner keyboard = new Scanner(System.in);
         System.out.print("Please enter three test scores \n");
         testScore1 = keyboard.nextInt();
         testScore2 = keyboard.nextInt();
         testScore3 = keyboard.nextInt();
         
         System.out.println("Scores: " + testScore1 + "," +
                          testScore2 + "," + testScore3);
         System.out.println("Average Score: " + (testScore1 + testScore2 + testScore3)/3);
     }
}
