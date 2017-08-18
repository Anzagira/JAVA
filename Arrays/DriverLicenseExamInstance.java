/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndArrayLists;
import java.util.Scanner;
/**
 *
 * @author Allan
 */
public class DriverLicenseExamInstance {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        DriverLicenseExam nadew = new DriverLicenseExam();
        String[] answers = new String[20];
        System.out.println("Please answer the following questions");
        //String ans = "A";
        for (int i = 0; i < answers.length; i++){
            System.out.printf("Q%d: ",i+1);
            String ans = keyboard.next();
            while(!(ans.equalsIgnoreCase("A")|ans.equalsIgnoreCase("B")|ans.equalsIgnoreCase("C")|ans.equalsIgnoreCase("D"))){
                System.out.print("Please choose a letter from A to D: ");
                ans = keyboard.next();
            }
            answers[i] = ans;
        }
        nadew.setStudentAnswers(answers);
        System.out.println("Here is a summary of your results");
        System.out.println("Total Correct Answers: " + nadew.totalCorrect());
        System.out.println("Total Incorrect Answers: " + nadew.totalIncorrect());
        System.out.print("Questions Missed: ");
        int[] wrongs = nadew.questionsMissed();
        for(int i = 0; i < wrongs.length; i++)
            if (wrongs[i] != 0)
                System.out.print(wrongs[i] + " ");
        if(nadew.passed())
            System.out.println("\nYou have Passed the Exam");
        else
            System.out.println("\nYou Failed the Exam");
    }
}
