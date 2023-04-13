package com.sagar.kkp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
//        System.out.println(Arrays.toString(runningSum(nums)));
        running(nums);
    }
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }

    public static void running(int[] nums) {
        int sum = 0;
        int index = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        run(nums, index, sum /*ans*/);
        System.out.println(sum);
    }

    private static ArrayList<Integer> run(int[] nums, int i, int sum /*ArrayList<Integer> ans*/) {
        List<Integer> list = new ArrayList<>();
        if (i == nums.length) {
//            return list.add(sum);
        }
        return run(nums, i+1, sum + nums[i]);
    }
}