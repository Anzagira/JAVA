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
public class CoinTossSimulator {
    public static void main(String[] args){
        CoinToss coin = new CoinToss();
        System.out.println("Side facing up is: " + coin.getSideUp());
        int headNumber = 0;
        int tailNumber = 0;
        for(int i = 1; i < 21; i++){
            
            coin.toss();
            System.out.printf("Toss %d:", i );
            System.out.print(coin.getSideUp() + "\n"); 
            if(coin.getSideUp().equals("head"))
                headNumber++;
            else
                tailNumber++;
        }
        System.out.println("Number of Heads: " + headNumber);
        System.out.println("Number of Tails: " + tailNumber);
    }
}
