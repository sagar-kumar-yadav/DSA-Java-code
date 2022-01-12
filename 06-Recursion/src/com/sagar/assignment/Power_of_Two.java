package com.sagar.assignment;

// https://leetcode.com/problems/power-of-two/

public class Power_of_Two {
    public static void main(String[] args) {
        int n = 16;
//        System.out.println(isPowerOfTwo(n));
        System.out.println(isPowerOfTwoRec(n));
    }
    // iterative approach
    public static boolean isPowerOfTwo(int n) {
        for (int i = 0; i <= 31; i++) {
            if (n == Math.pow(2, i)){
                return true;
            }
        }
        return false;
    }

    // recursive approach
    public static boolean isPowerOfTwoRec(int n) {
        if (n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        if (n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n/2);
    }
}
