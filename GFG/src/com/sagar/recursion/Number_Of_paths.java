package com.sagar.recursion;

// https://practice.geeksforgeeks.org/problems/number-of-paths0926/1
// Number of paths

public class Number_Of_paths {
    public static void main(String[] args) {
        int M = 3;
        int N = 3;
        System.out.println(numberOfPaths(M, N));
    }
    static long numberOfPaths(int m, int n){
        // if given row number is first or column number is first
        // base case
        if (m == 1 || n == 1){
            return 1;
        }
        return numberOfPaths(m-1, n) + numberOfPaths(m, n-1);
    }
}
