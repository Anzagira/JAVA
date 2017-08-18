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
public class PersonalInformation {
    private String name;
    private String address;
    private int age;
    private long phoneNumber;
    
    public void setName(String nom){
        name = nom;
    }
    
    public void setAddress(String add){
        address = add;
    }
    
    public void setAge(int years){
        age = years;
    }
    
    public void setPhoneNumber(long number){
        phoneNumber = number;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public int getAge(){
        return age;
    }
    
    public long getPhoneNumber(){
        return phoneNumber;
    }
}
