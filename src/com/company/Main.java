package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here
        Scanner reader = new Scanner(new File("Imports.txt"));
        int maxIndex = -1;
        String values [] = new String[1000];
        
        while (reader.hasNext()){
            maxIndex++;
            values[maxIndex]=reader.nextLine();
        }
    }
}
