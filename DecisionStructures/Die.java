/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecisionStructures;
import java.util.Random;
/**
 *Random class generates random numbers as illustrated below from 1 to 6. Default is from 0 to limit specified.
 * @author LAB Student
 */
public class Die {
    private int value;
    Random randomNumbers = new Random();
    
    public void roll(){
        value = randomNumbers.nextInt(6) + 1;
    } 
    
    public int getValue(){
        return value;
    }
}
