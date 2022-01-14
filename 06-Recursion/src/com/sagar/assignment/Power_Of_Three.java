package com.sagar.assignment;

// https://leetcode.com/problems/power-of-three/

import java.util.Scanner;

public class Power_Of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(isPowerOfThreeRec(n));
        System.out.println(isPowerOfThree(n));
    }

    // iterative approach
    public static boolean isPowerOfThree(int n){
        for (int i = 0; i <= 31; i++) {
            if (n == Math.pow(3, i)) {
                return true;
            }
        }
        return false;
    }

    // recursive approach
    public static boolean isPowerOfThreeRec(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        return (n % 3 == 0 && isPowerOfThreeRec(n/3));
    }
}