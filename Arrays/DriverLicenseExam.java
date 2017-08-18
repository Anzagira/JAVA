/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndArrayLists;

/**
 *
 * @author Allan
 */
public class DriverLicenseExam {
    private final String[] markingScheme={"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"};
    private String[] studentAnswers;
    
    public void setStudentAnswers(String[] answers){
        studentAnswers = answers;
    }
    
    public int totalCorrect(){
        int correct = 0;
        for (int i = 0; i < markingScheme.length; i++){
            if(studentAnswers[i].equalsIgnoreCase(markingScheme[i]))
                correct++;         
        }
        return correct;
    }
    public int totalIncorrect(){
        return markingScheme.length - this.totalCorrect();
    }
    public boolean passed(){
        boolean status = false;
        if(this.totalCorrect() >= 15)
            status = true;
        return status;
    }
    public int[] questionsMissed(){
        int[] missed = new int[markingScheme.length];
        for (int i = 0; i < markingScheme.length; i++){
            if(!(studentAnswers[i].equalsIgnoreCase(markingScheme[i])))
                missed[i] = i;                 
        }
        return missed;
    }
}


