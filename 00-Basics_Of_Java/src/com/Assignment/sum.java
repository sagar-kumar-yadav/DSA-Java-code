package com.Assignment;

// Take two numbers and print the sum of both.

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter first number here: ");
        int a = in.nextInt();

        System.out.print("enter second number here: ");
        int b = in.nextInt();

        int sum = a + b;
        System.out.println("This is your sum "+sum );

    }
}
