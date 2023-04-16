package com.sagar.assignment.cyclicsort;

public class missing_number {
    public static void main(String[] args) {
//        int[] nums = {3, 0, 1};                             // output:- 2
        int[] nums = {1, 4, 3};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i , correct);
            }else {
                i++;
            }
        }
        // search for first missing number
        // case-1
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        // case 2
        return nums.length;
    }
    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
