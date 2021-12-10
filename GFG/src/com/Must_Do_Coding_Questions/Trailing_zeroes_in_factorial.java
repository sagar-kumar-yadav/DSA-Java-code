package com.Must_Do_Coding_Questions;

// https://practice.geeksforgeeks.org/problems/trailing-zeroes-in-factorial5134/1
// Trailing zeroes in factorial

public class Trailing_zeroes_in_factorial {
    public static void main(String[] args) {
        int N = 10;
        System.out.println(trailingZeroes(N));
    }

    private static int trailingZeroes(int N) {
        int ans = 0;
        int p = 5;
        while (N/p > 0) {
            ans += (N/p);
            p = p * 5;
        }
        return ans;
    }
}
