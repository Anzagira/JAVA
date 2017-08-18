/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionStructures;
import java.util.Scanner;
/**
 *
 * @author LAB Student
 */
public class FatGramInstance {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        FatGram fufu = new FatGram();
        System.out.print("Please enter the number of calories: ");
        int num = keyboard.nextInt();
        fufu.setNumberOfCalories(num);
        System.out.print("Please enter the number of fat grams: ");
        int fat = keyboard.nextInt();
        fufu.setFatGrams(fat);
        if(fat > num){
            System.out.println("Numbers are invalid");  
        }
        else{
            System.out.println("Percentage of calories: " + fufu.getPercentCalories() +"%");
            if (fufu.getPercentCalories() < 30)
                System.out.println("Food is low in fat");
        }
    }
}
