package com.Assignment;

// Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = in.nextInt();

        for (int i=0; i<10; i++){
            System.out.println(num + "x" + (i+1) + "=" + (num * (i + 1)));
        }
    }
}
