package com.sagar.Basics;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibonacci(n));
    }
    static int fibonacci(int n){
        // base condition
        if (n <= 1){
            return n;
        }
        return fibonacci(n-1) + (n - 2);
    }
}
