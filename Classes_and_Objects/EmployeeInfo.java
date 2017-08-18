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
public class EmployeeInfo {
    public static void main(String[] args){
        Employee Susan = new Employee();
        Susan.setName("Susan Meyers");
        Susan.setId(47899);
        Susan.setDepartment("Accounting");
        Susan.setPosition("Vice President");
        
        System.out.println("Name: " + Susan.getName() +
                           "\nId Number: " + Susan.getId() +
                           "\nDepartment: " + Susan.getDepartment() + 
                           "\nPosition: " + Susan.getPosition()+ "\n");
        
        Employee Mark = new Employee();
        Mark.setName("Mark Jones");
        Mark.setId(39119);
        Mark.setDepartment("IT");
        Mark.setPosition("Programmer");
        
        System.out.println("Name: " + Mark.getName() +
                           "\nId Number: " + Mark.getId() +
                           "\nDepartment: " + Mark.getDepartment() + 
                           "\nPosition: " + Mark.getPosition()+ "\n");
        
        Employee Joy = new Employee();
        Joy.setName("Joy Rogers");
        Joy.setId(81774);
        Joy.setDepartment("Manufacturing");
        Joy.setPosition("Engineer");
        
        System.out.println("Name: " + Joy.getName() +
                           "\nId Number: " + Joy.getId() +
                           "\nDepartment: " + Joy.getDepartment() + 
                           "\nPosition: " + Joy.getPosition()+ "\n");
    }
}
