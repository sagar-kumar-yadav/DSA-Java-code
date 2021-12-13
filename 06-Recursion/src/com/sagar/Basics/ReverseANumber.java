package com.sagar.Basics;

import java.util.Arrays;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 12345;   // 54321
        reverse1(n);
        System.out.println(sum);

    }
    static int sum = 0;
    static void reverse1(int n){
        //base condition
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse1(n/10);
    }
}
