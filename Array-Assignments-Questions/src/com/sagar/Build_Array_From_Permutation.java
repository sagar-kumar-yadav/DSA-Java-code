package com.sagar;

// https://leetcode.com/problems/build-array-from-permutation/
// Q. 1920. Build Array from Permutation

import java.lang.reflect.Array;
import java.util.Arrays;

public class Build_Array_From_Permutation {

    public static void main(String[] args) {
	    int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    static int[] buildArray(int[] nums){
        int[] ans = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
