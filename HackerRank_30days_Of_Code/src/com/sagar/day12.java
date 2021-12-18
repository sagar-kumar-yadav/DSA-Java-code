package com.sagar;

import java.io.*;
import java.util.*;

public class day12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lastname = sc.next();
        String firstName = sc.next();
        int idNumber = sc.nextInt();

        int ts = sc.nextInt();
        int[] TScores = new int[ts];
        for (int i = 0; i < ts; i++) {
            TScores[i] = sc.nextInt();
        }
        calculate(lastname, firstName, idNumber, TScores);
    }

    private static void calculate(String lastName, String firstName, int idNumber, int[] TScore) {
        System.out.println("Name: "+ firstName+", "+lastName);
        System.out.println("ID: "+ idNumber);

        int sum = 0;
        for (int i = 0; i < TScore.length; i++) {
            sum += TScore[i];
        }
        int avg = sum/ TScore.length;

        if (avg >= 90 && avg <= 100){
            System.out.println("Grade: O");
        }
        else if (avg >= 80 && avg < 90){
            System.out.println("Grade: E");
        }
        else if (avg >= 70 && avg < 80){
            System.out.println("Grade: A");
        }
        else if (avg >= 55 && avg < 70){
            System.out.println("Grade: P");
        }
        else if (avg >= 40 && avg < 55){
            System.out.println("Grade: D");
        }
        else if (avg < 40){
            System.out.println("Grade: T");
        }
    }
}