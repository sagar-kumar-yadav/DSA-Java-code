package com.sagar;

// https://leetcode.com/problems/valid-perfect-square/
// 367. Valid Perfect Square

public class Valid_Perfect_Square {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(isPerfectSquare(num));
    }

    private static boolean isPerfectSquare(int num) {

   /*   // bruteforce
        long i = 1;
        while (i <= num){
            if (i*i == num){
                return true;
            }
            i++;
        }
        return false;
    }
    */
        // binary search
        int start = 1;
        int end = num;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            long x = mid * mid;
            if (x == num) {
                return true;
            }
            else if (x < num) {
                start = (int) mid + 1;
            }
            else {
                end = (int) mid - 1;
            }
        }
        return false;
    }
}
