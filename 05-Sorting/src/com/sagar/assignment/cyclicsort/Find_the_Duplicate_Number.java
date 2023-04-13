package com.sagar.assignment.cyclicsort;

public class Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};                   // output:- 2
//        System.out.println(findDuplicate(nums));
        System.out.println(findDuplicate1(nums));
    }
    // method - 1     :----------------------------------------------------------------------------------------------
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1){
                return nums[index];
            }
        }
        return nums.length;
    }
    private static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }

    // method -2 :----------------------------------------------------------------------------------------------------
    public static int findDuplicate1(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap1(nums, i, correct);
                }else {
                    return nums[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }
    private static void swap1(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
