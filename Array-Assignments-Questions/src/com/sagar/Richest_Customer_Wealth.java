package com.sagar;
// https://leetcode.com/problems/richest-customer-wealth/
// 1672. Richest Customer Wealth

public class Richest_Customer_Wealth {
    public static void main(String[] args){
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts){
        // row  = customer
        // col = accounts

        int ans = Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum = sum + accounts[row][col];
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
