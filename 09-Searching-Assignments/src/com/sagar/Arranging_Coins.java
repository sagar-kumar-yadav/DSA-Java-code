package com.sagar;

// https://leetcode.com/problems/arranging-coins/
// 441. Arranging Coins

public class Arranging_Coins {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }

    private static int arrangeCoins(int n) {

     /*
        // bruteforce
        int i = 1;
        while (i <= n){
            n = n - i;
            i++;
        }
        return i - 1;
    }
        */


        // binary Search
        long start = 0;
        long end = n;

        while (start <= end){
            long mid = start + (end - start)/2;

            long sum = mid * (mid + 1)/2;
            if (sum == n) {
                return (int) mid;
            }
            else if (sum > n){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return (int) end;
    }
}
