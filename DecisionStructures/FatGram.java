/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionStructures;

/**
 *
 * @author LAB Student
 */
public class FatGram {
    private int numberOfCalories;
    private int fatGrams;
    public void setNumberOfCalories(int num){
        numberOfCalories = num;
    }
    public void setFatGrams(int fat){
        fatGrams = fat;
    }
    
    public double getPercentCalories(){
        double calFromFat = fatGrams * 9;
        return (calFromFat /numberOfCalories) * 100;
    }
}
