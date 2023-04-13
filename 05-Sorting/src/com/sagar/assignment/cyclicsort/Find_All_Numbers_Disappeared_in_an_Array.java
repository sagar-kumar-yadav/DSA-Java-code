package com.sagar.assignment.cyclicsort;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 1, 3};                      // output:- 5, 6
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] -1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }
    private static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
