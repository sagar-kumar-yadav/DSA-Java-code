package com.sagar.assignment;

// https://leetcode.com/problems/combination-sum-iv/

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_IV {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 4;
        System.out.println(combinationSum4(nums, target));
    }
    // recursive approach (TLE)
    public static int combinationSum4(int[] nums, int target) {
        if (target == 0){
            return 1;
        }
        if (target < 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += combinationSum4(nums, target - nums[i]);
        }
        return count;
    }
}
