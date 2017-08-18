/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopsAndFiles;
import java.util.Random;
/**
 *
 * @author LAB Student
 */
public class CoinToss {
    private String sideUp;
    
    public void setSideUp(String side){
        sideUp = side;
    }
    public void toss(){
        Random randomnumber = new Random();
        int number = randomnumber.nextInt(2);
        //System.out.println(number);
        if (number == 0)
            this.setSideUp("head");
        else
            this.setSideUp("tail");
    }
    public String getSideUp(){
        return sideUp;
    }
    public CoinToss(){
        this.toss();
    }
}
