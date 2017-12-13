package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args)throws IOException {
	// write your code here
        Scanner reader = new Scanner(new File("Imports.txt"));
        int maxIndex = -1;
        String values [] = new String[26];

        while (reader.hasNext()){
            maxIndex++;
            values[maxIndex]=reader.nextLine();
        }
        //System.out.println(values[0]);
        //Print out avergage
        //split
        String grades [] = new String[1000];
        for(int i =1; i <  values.length; i++)
        {
            String [] newA  = values[i].split("\t");
            grades[i-1]= newA[2];

        }
        System.out.println(grades[0]);
    }
}
