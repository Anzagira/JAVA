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
public class ISP2 {
    private String Package;
    private int numberOfHours;
    private double total;
    public double savings;
    
    public void setPackage(String pack){
        Package = pack;
    }
    
    public void setNumberOfHours(int hours){
        numberOfHours = hours;
    }
    
    public double getTotalCharges(){
        
        switch (Package){
            case "A":
                if (numberOfHours > 10)
                    total =  9.95 + 2 * (numberOfHours - 10);
                else
                    total = 9.95;
                break;
                
            case "B":
                if (numberOfHours > 20)
                    total = 14.95 + 1 * (numberOfHours - 20);
                else
                    total = 14.95;
                break;
            case "C":
                total = 19.95;  
                break;
            default:
                System.out.println("Please enter A, B or C");
                total = 0.00;
        }  
        return total;
    }
    
    public void getSavings(){
        if (Package.equalsIgnoreCase("A")){
            if (numberOfHours > 10){
                savings = (9.95 + 2 * (numberOfHours - 10)) - 19.95;
                if (savings >0){
                System.out.println("Savings from A to C: " + savings);
                }
            }
            if (numberOfHours > 10 && numberOfHours < 20){
                savings = (9.95 + 2 * (numberOfHours - 10)) - 14.95;
                if (savings > 0){
                System.out.println("Savings from A to B: " + savings);
                }
            }
            if (numberOfHours > 20){
                savings = (9.95 + 2 * (numberOfHours - 10)) - (14.95 + 1 * (numberOfHours - 20));
                if (savings >0){
                System.out.println("Savings from A to B: " + savings);
                }
            }
        }
        if (Package.equalsIgnoreCase("B")){
            if (numberOfHours > 20){
                savings = (14.95 + 1 * (numberOfHours - 20)) - 19.95;
                if (savings >0){
                System.out.println("Savings from B to C: " + savings);
                }
            }       
    }
   


}
}
