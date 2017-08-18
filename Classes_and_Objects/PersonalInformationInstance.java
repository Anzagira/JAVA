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
public class PersonalInformationInstance {
    public static void main(String[] args){
        
        PersonalInformation firstPerson = new PersonalInformation();
        firstPerson.setName("Norbert");
        firstPerson.setAddress("1207 Arlee Street, Apt. N, Greensboro, NC 27401");
        firstPerson.setAge(34);
        firstPerson.setPhoneNumber(3343390140L);
        
        PersonalInformation secondPerson = new PersonalInformation();
        secondPerson.setName("Allan");
        secondPerson.setAddress("1207 Arlee Street, Apt. N, Greensboro, NC 27401");
        secondPerson.setAge(28);
        secondPerson.setPhoneNumber(3366869161L);
        
        PersonalInformation thirdPerson = new PersonalInformation();
        thirdPerson.setName("Hilary");
        thirdPerson.setAddress("1012 Dewey Street, Apt. F, Greensboro, NC 27401");
        thirdPerson.setAge(43);
        thirdPerson.setPhoneNumber(3343390134L);
        
        System.out.println("Name: " + secondPerson.getName() + "\nAddress: " + 
                           secondPerson.getAddress() + "\nAge: " + secondPerson.getAge() + 
                           "\nPhone Number: " +secondPerson.getPhoneNumber() + "\n");
       
        System.out.println("Name: " +secondPerson.getName() + "\nAddress: " + 
                           secondPerson.getAddress() + "\nAge: " + secondPerson.getAge() + 
                           "\nPhone Number: " + secondPerson.getPhoneNumber() + "\n");
        
        System.out.println("Name: " + thirdPerson.getName() + "\nAddress: " + 
                           thirdPerson.getAddress() + "\nAge: " + thirdPerson.getAge() + 
                           "\nPhone Number: " + thirdPerson.getPhoneNumber());
    }
}
