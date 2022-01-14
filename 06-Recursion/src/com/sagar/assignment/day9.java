package com.sagar.assignment;

// https://www.hackerrank.com/challenges/30-recursion/problem?isFullScreen=true

import java.util.Scanner;

public class day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
