package com.sagar;

// Q. Java Program to Check if a Given Integer is Odd or Even
// https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/

import java.util.Arrays;
import java.util.Scanner;

public class Odd_Or_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        check(n);
    }
    static void check(int n){
        if (n % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
