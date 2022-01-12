package com.sagar.assignment;

// https://www.geeksforgeeks.org/sum-of-natural-numbers-using-recursion/

public class Sum_of_natural_numbers_using_recursion {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        if (n <= 1) {
            return n;
        }

        return n + sum(n - 1);
    }
}