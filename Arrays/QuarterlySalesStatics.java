/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndArrayLists;
import java.util.Scanner;
/**
 *
 * @author Allan
 */
public class QuarterlySalesStatics {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int sales;
        int rows = 2;
        int cols = 3;
        int[] quarterSales = new int[cols]; 
        int[][] salesFigures = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            System.out.printf("Please enter the sales figures for Division %d:", i+1);
            System.out.println("");
            for(int j = 0; j < cols; j++){
                System.out.printf("Quater %d: ", j+1);
                sales = keyboard.nextInt();
                while (sales < 0){
                    System.out.print("Please enter a positive value: ");
                    sales = keyboard.nextInt();
                }
                salesFigures[i][j] = sales;
            }
        }
        System.out.println("");
        for(int i = 0; i < rows; i++){
            System.out.printf("Sales Figures for Division %d are as follows", i+1);
            System.out.println("");
            for(int j = 0; j < cols; j++){
                System.out.printf("Quater %d: ", j+1);
                System.out.println(salesFigures[i][j]);
            }           
        }
        System.out.println("");
        for(int j = 0; j < cols; j++){
            int total = 0;
            for(int i = 0; i < rows; i++){
                total += salesFigures[i][j];
            }
            quarterSales[j] = total;
            System.out.printf("Quarter %d", j+1);
            System.out.println("\nTotal Sales: " + total);
            System.out.println("Average Sales: " + total/rows);
        }
        System.out.println("");
        for(int i = 0; i < rows; i++){
            System.out.printf("Division %d Sales", i+1);
            System.out.println("");
            for(int j = 1; j < cols; j++){            
                int change = salesFigures[i][j] - salesFigures[i][j-1];
                if(change > 0){
                    System.out.printf("Increase from Quarter %d to Quarter %d: ", j, j+1);
                    System.out.print(change + "\n");
                }
                else{
                    System.out.printf("Decrease from Quarter %d to Quarter %d: ", j, j+1);
                    System.out.print(change + "\n");
                }
            }
        }
        System.out.println("\nCompany Sales");
        for(int j = 1; j < cols; j++){            
                int change = quarterSales[j] - quarterSales[j-1];
                if(change > 0){
                    System.out.printf("Increase from Quarter %d to Quarter %d: ", j, j+1);
                    System.out.print(change + "\n");
                }
                else{
                    System.out.printf("Decrease from Quarter %d to Quarter %d: ", j, j+1);
                    System.out.print(change + "\n");
                }
            }
        System.out.println("");
        System.out.println("Division with highest sales for each quarter");
        for(int j = 0; j < cols; j++){
            int highest = 0;
            int index = 0;
            for(int i = 0; i < rows; i++){
                if (salesFigures[i][j] > highest){
                    highest = salesFigures[i][j];
                    index = i+1;
                }                
            }
            System.out.printf("Quarter %d: ", j+1);
            System.out.print(index +"\n");
                
        }
    }
}
