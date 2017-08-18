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
public class TestScoreInfo {
    public static void main(String[] args){
        
        TestScores student = new TestScores();
        int score1, score2, score3;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter three test scores\n" + 
                         "First Score: ");
        score1=keyboard.nextInt();
        
        System.out.print("Second Score: ");
        score2=keyboard.nextInt();
        
        System.out.print("Third Score: ");
        score3=keyboard.nextInt();
        
        student.setFirstTestScore(score1);
        student.setSecondTestScore(score2);
        student.setThirdTestScore(score3);
        
        System.out.println("Your Average Score is: " + student.getAverageScore());
    }
}
