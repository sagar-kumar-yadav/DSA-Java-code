package com.sagar;

import java.util.Arrays;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 12345;   // 54321
        reverse1(n);
        System.out.println(Arrays.toString(n));

    }
    static void reverse1(int n){
        if (n == 0){
            return;
        }
        int sum = 0;
        int rem = n % 10;
        sum = sum * 10 * rem;
        reverse1(n/10);
    }
}
