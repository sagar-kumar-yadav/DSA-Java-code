package com.Must_Do_Coding_Questions;

// https://practice.geeksforgeeks.org/problems/nth-natural-number/1#
// Nth Natural Number

public class Nth_Natural_Number {
    public static void main(String[] args) {
        int N = 50;
        System.out.println(findNth(N));
    }

    private static long findNth(int N) {

        // store Nth number
        long ans = 0;

        long temp = 1;
        while (N > 0){

            // find remainder
            long r = N % 9;

            ans = ans + temp *(r);

            temp = temp * 10;

            // find quotient
            N = N / 9;
        }
        return ans;
    }
}
