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
public class RunningTheRaceInstance {
    public static void main(String[] args){
        RunningTheRace race1 = new RunningTheRace();
        race1.setRunner1("Allan");
        race1.setRunner2("Nadew");
        race1.setRunner3("Rafiya");
        race1.setTime1(5.0);
        race1.setTime2(8.6);
        race1.setTime3(6.5);
        System.out.println("1st Place: " + race1.getFirstPlace() + 
                           "\n2nd Place: " + race1.getSecondPlace() + 
                           "\n3rd Place: " + race1.getThirdPlace());
    }
}
