/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopsAndFiles;

/**
 *
 * @author LAB Student
 */
public class Population {
    private int startingNumber;
    private double percentIncrease;
    private int numberOfDays;
    
    public void setStartingNumber(int num){
        startingNumber = num;
    }
    public void setPercentIncrease(double increase){
        percentIncrease = increase;
    }
    public void setNumberOfDays(int days){
        numberOfDays = days;
    }
    
    public void getPopulation(){
        double totalPopulation;
        System.out.println("Daily Population is given below:");
        for(int i = 1; i < numberOfDays + 1; i++){
            totalPopulation = startingNumber + startingNumber *(percentIncrease/100)* i;
            System.out.println("Day " + i + "\t" + (int)totalPopulation);
        }
    }
}
