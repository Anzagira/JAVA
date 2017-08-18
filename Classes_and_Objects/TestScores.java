/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_and_Objects;

/**
 *
 * @author LAB Student
 */
public class TestScores {
    private int firstTestScore;
    private int secondTestScore;
    private int thirdTestScore;
    
    public void setFirstTestScore(int score1){
        firstTestScore = score1;
    }
    
    public void setSecondTestScore(int score2){
        secondTestScore = score2;
    }
    
    public void setThirdTestScore(int score3){
        thirdTestScore = score3;
    }
    
    public double getAverageScore(){
        return (double)(firstTestScore + secondTestScore + thirdTestScore)/ 3;
    }
    
}
