package com.sagar.assignment;

// https://www.codechef.com/problems/FIBXOR01/

import java.util.Scanner;

public class Special_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(fib(a, b, n%3));
        }
    }

    private static int fib(int a, int b, int n) {
        if (n == 0){
            return a;
        }
        if (n == 1) {
            return b;
        }
        return fib(a, b, n-1) ^ fib(a, b, n-2);
    }
}
