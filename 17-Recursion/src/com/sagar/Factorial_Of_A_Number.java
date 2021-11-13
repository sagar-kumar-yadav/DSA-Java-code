package com.sagar;

public class Factorial_Of_A_Number {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
    static int factorial(int n){
        // base case
        if (n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
