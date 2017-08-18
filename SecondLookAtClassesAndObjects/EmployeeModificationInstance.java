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
public class EmployeeModificationInstance {
    public static void main(String[] args){
        EmployeeModification Susan = new EmployeeModification("Susan Meyers", 47899, "Accounting", "Vice President");
        System.out.println("Name: " + Susan.getName() +
                           "\nId Number: " + Susan.getId() +
                           "\nDepartment: " + Susan.getDepartment() + 
                           "\nPosition: " + Susan.getPosition()+ "\n");
        
        EmployeeModification Mark = new EmployeeModification("Mark Jones", 39119);       
        System.out.println("Name: " + Mark.getName() +
                           "\nId Number: " + Mark.getId() +
                           "\nDepartment: " + Mark.getDepartment() + 
                           "\nPosition: " + Mark.getPosition()+ "\n");
        
        EmployeeModification Joy = new EmployeeModification();
        System.out.println("Name: " + Joy.getName() +
                           "\nId Number: " + Joy.getId() +
                           "\nDepartment: " + Joy.getDepartment() + 
                           "\nPosition: " + Joy.getPosition()+ "\n");
    }    
}
