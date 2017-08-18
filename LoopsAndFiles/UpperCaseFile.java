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
public class UpperCaseFile {
    private final String filename1;
    private final String filename2;
    public UpperCaseFile(String name1, String name2){
        filename1 = name1;
        filename2 = name2;        
    }
    public void getTransform()throws IOException{
        File Out = new File(filename2);
        PrintWriter outFile = new PrintWriter(Out);
        File reader = new File(filename1);
        Scanner reading = new Scanner(reader);
        //String info;
        while (reading.hasNext()){    
            //info = reading.nextLine().toUpperCase();
            //System.out.println(info);            
            
            outFile.println(reading.nextLine().toUpperCase());
        }
        outFile.close();
    }
}
