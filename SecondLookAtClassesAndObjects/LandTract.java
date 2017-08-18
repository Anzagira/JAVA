/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondLookAtClassesAndObjects;

/**
 *
 * @author LAB Student
 */
public class LandTract {
    private int tractLength;
    private int tractWidth;
    
    public LandTract(){
        tractLength = 0;
        tractWidth = 0;
    }
    public void setTractLength(int len){
        tractLength = len;
    }
    public void setTractWidth(int wid){
        tractWidth = wid;
    }
    /*public LandTract(LandTract tract){
        tractLength = tract.tractLength;
        tractWidth = tract.tractWidth;
    }*/
    public int getArea(){
        return tractLength * tractWidth;
    }
    public boolean equalsTo(LandTract tract){
        return tractLength * tractWidth == tract.tractLength *tract.tractWidth;
    }
    public String toString(){
        String tract = "Tract Length: " + tractLength +
                       "\nTract Width: " + tractWidth;
        return tract;
    }
    
    
}
