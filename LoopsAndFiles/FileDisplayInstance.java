/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopsAndFiles;
import java.io.*;
/**
 *
 * @author LAB Student
 */
public class FileDisplayInstance {
    public static void main(String[] args)throws IOException{
        String name = "C:/Users/Lab Student/Desktop/Deposits.txt";
        FIleDisplay client = new FIleDisplay(name);
        client.displayHead();
        System.out.println("\n");
        client.displayContents();
        System.out.println("\n");
        client.displayWithLineNumbers();
        
    }
}
