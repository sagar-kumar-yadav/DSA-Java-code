package com.sagar.assignment;

// https://leetcode.com/problems/fibonacci-number/
// 509. Fibonacci Number

class Fibonacci_Number {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        // base case
        if (n < 2){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }
}