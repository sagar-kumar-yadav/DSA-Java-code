package com.sagar;

// https://leetcode.com/problems/shuffle-the-array/
// 1470. Shuffle the Array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shuffle_The_Array {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    private static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];

        for (int i = 0; i < n; i++) {
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[i+n];
        }
        return ans;
    }
}
