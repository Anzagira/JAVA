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
public class DiceSimulator {
    public static void main(String[] args){
    Die first = new Die();
    first.roll();
    System.out.println("First Die: " +first.getValue());
    
    Die second = new Die();
    second.roll();
    System.out.println("Second Die: " + second.getValue());
    }     
}
