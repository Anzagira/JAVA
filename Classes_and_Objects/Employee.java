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
public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    public void setName(String nom){
        name = nom;
    }
    public void setId(int id){
        idNumber  = id;
    }
    public void setDepartment(String dep){
        department = dep;
    }
     
    public void setPosition(String pos){
        position = pos;
    }
    
    public String getName(){
        return name;
    }
    
    public int getId(){
        return idNumber;
    }
       public String getDepartment(){
        return department;
    }   
    
       public String getPosition(){
        return position;
    }
}
