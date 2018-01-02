package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException
    {
        Scanner reader = new Scanner(new File("Imports.txt"));
        int maxIndx = -1;
        String values[]=new String[1000];
        while(reader.hasNext())
        {
            maxIndx++;
            values[maxIndx]=reader.nextLine();
        }
        int avg=0;
        int As =0;
        int Bs= 0;
        int Cs=0;
        int Ds=0;
        int Fs=0;
        int j;
        int letterGrade;
        String Letters= "";
        for (j = 0; j <= maxIndx; j++)
        {
            Scanner sc = new Scanner(values[j].substring(0,1) );
            letterGrade = sc.next();
            avg =+ letterGrade;
            int absences = sc.nextInt();
            if (letterGrade>89){
                As++;
            }
            else if (letterGrade>79){
                Bs++;
            }
            else if (letterGrade>69){
                Cs++;
            }
            else if (letterGrade>59){
                Ds++;
            }
            else{
                Fs++;
            }
        }
        System.out.println("The Class average is " + avg/j + "%");
        System.out.println("There were "+As+" A's, "+Bs+"B's, "+Cs+"C's, "+Ds+"D's, and "+Fs+"F's.");}}