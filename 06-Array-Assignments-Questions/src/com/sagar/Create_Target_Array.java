package com.sagar;

// https://leetcode.com/problems/create-target-array-in-the-given-order/
// 1389. Create Target Array in the Given Order

import java.util.ArrayList;
import java.util.Arrays;

public class Create_Target_Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 0};
        int[] index = {0, 1, 2, 3, 0};
         System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    private static int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int currentIndex = i;
            if (index[i] < currentIndex){
                for (int j = currentIndex-1; j >= index[i]; j--) {
                    ans[j+1] = ans[j];
                }
            }
            ans[index[i]] = nums[i];
        }
        return ans;
    }
}
