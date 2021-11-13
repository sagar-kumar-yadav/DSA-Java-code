package com.sagar;

// https://www.efaculty.in/java-programs/voting-age-program-in-java/
// A person can vote if age is greater than or equal to 18.

import java.util.Scanner;

public class Voting_Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
    }
    static void check(int age){
        if (age >= 18){
            System.out.println("you are eligible");
        }
        else {
            System.out.println("you are not eligible");
        }
    }
}
