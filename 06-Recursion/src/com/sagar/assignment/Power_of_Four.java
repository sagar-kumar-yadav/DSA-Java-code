package com.sagar.assignment;

import java.util.Scanner;

class Power_of_Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(isPowerOfFour(n));
        System.out.println(isPowerOfFourRec(n));
    }

    // iterative approach
    public static boolean isPowerOfFour(int n) {
        for (int i = 0; i <= 31; i++) {
            if (n == Math.pow(4, i)){
                return true;
            }
        }
        return false;
    }

    // recursive approach
    public static boolean isPowerOfFourRec(int n) {
        if (n == 0){
            return false;
        }
        if (n == 1) {
            return true;
        }
        return (n % 4 == 0 && isPowerOfFourRec(n/4));
    }
}