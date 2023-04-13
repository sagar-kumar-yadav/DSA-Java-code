package com.Loops;

import java.util.Scanner;

// Fibonacci number :- 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
// find 2nd fib number ?        // Ans :- 1
// find 6th fib number ?        // Ans :- 8
public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        int count = 2;
        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
