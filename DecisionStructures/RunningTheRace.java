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
public class RunningTheRace {
    private String runner1;
    private String runner2;
    private String runner3;
    private double time1;
    private double time2;
    private double time3;
    private String firstPlace;
    private String secondPlace;
    private String thirdPlace;
    
    public void setRunner1(String run1){
        runner1 = run1;
    }
    public void setRunner2(String run2){
        runner2 = run2;
    }
    public void setRunner3(String run3){
        runner3 = run3;
    }
    public void setTime1(double sec1){
        time1 = sec1;
    }
    public void setTime2(double sec2){
        time2 = sec2;
    }
    public void setTime3(double sec3){
        time3 = sec3;
    }
    public String getFirstPlace(){
        if (time1 < time2 && time1 < time3)
            firstPlace = runner1;
        if (time2 < time1 && time2 < time3)
             firstPlace = runner2;
        if (time3 < time1 && time3 < time2)
             firstPlace = runner3;
        return firstPlace;
    }
        public String getSecondPlace(){
        if (time1 < time2 && time1 < time3){
            if (time2 < time3)
                secondPlace = runner2;
            else 
                secondPlace = runner3;
        }     
        if (time2 < time1 && time2 < time3){
            if (time1 < time3)
                secondPlace = runner1;
            else 
                secondPlace = runner3;
        }        
        if (time3 < time1 && time3 < time2){
            if (time1 < time2)
                secondPlace = runner1;
            else 
                secondPlace = runner2;
        }
        return secondPlace;
    }
        
        public String getThirdPlace(){
        if (time1 < time2 && time1 < time3){
            if (time2 < time3)
                thirdPlace = runner3;
            else 
                thirdPlace = runner2;
        }     
        if (time2 < time1 && time2 < time3){
            if (time1 < time3)
                thirdPlace = runner3;
            else 
                thirdPlace = runner1;
        }        
        if (time3 < time1 && time3 < time2){
            if (time1 < time2)
                thirdPlace = runner2;
            else 
                thirdPlace = runner1;
        }
        return thirdPlace;
    }
}
