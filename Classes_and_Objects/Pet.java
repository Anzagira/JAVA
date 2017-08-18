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
public class Pet {
    private String name;
    private String type;
    private int age;
    
    public void setName(String nom){
        name = nom;
    }
    
    public void setType(String typ){
        type = typ;
    }

    public void setAge(int years){
        age = years;
    }
    
    public String getName(){
        return name;
    }
    
    public String getType(){
        return type;
    }
    public int getAge(){
        return age;
    }
}
