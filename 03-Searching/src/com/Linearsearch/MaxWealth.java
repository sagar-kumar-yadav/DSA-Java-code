package com.Linearsearch;

import java.util.Arrays;

// https://leetcode.com/problems/richest-customer-wealth/
// Q. Richest Customer Wealth
public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        int ans = maximumWealth(arr);
//        System.out.println(Arrays.toString(ans));
    }
    static int maximumWealth(int[][] accounts){
        // coustomer = row
        // account = col

        int ans = Integer.MIN_VALUE;
        for (int coustomer = 0; coustomer < accounts.length; coustomer++) {
            int sum = 0;
            for (int account = 0; account < accounts[coustomer].length; account++) {
                sum = sum + accounts[coustomer][account];
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
