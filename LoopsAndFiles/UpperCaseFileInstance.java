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
public class UpperCaseFileInstance {
    public static void main(String[] args) throws IOException{
        UpperCaseFile client = new UpperCaseFile("C:/Users/Lab Student/Desktop/lab.txt", "C:/Users/Lab Student/Desktop/newlab.txt");
        client.getTransform();                
    }
}
