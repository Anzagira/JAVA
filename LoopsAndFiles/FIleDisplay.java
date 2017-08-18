/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopsAndFiles;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author LAB Student
 */
public class FIleDisplay{
    private final String filename;
    public FIleDisplay(String name){
        filename = name;
    }

    public void displayHead() throws IOException{
        File nom = new File(filename);
        Scanner file = new Scanner(nom);
        for(int i = 0; i < 5; i++){
            if(file.hasNext())
                System.out.println(file.next());
            else
                break;
        }
    }
    public void displayContents()throws IOException{
        File nom = new File(filename);
        Scanner file = new Scanner(nom);
        while (file.hasNext()){
            System.out.println(file.next());
        }        
    }
    public void displayWithLineNumbers()throws IOException{
        File nom = new File(filename);
        Scanner file = new Scanner(nom);
        int count = 1;
        while (file.hasNext()){
            System.out.printf("Line %d. ",count);
            System.out.println(file.next());
            count++;
        }        
    }
}

