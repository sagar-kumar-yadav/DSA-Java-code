package com.assignment;

// https://leetcode.com/problems/running-sum-of-1d-array/
// 1480. Running Sum of 1d Array

import java.lang.reflect.Array;
import java.util.Arrays;

public class Running_Sum_Of_1D_Array {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums){
        int[] ans = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}
