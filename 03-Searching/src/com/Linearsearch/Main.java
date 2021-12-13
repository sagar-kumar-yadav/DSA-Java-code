package com.Linearsearch;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
//        System.out.println(linearSearch(nums, target));
//        System.out.println(linearSearch1(nums, target));
        System.out.println(linearSearch2(nums, target));
    }
    // search the target and return true or false
    static boolean linearSearch(int[] nums, int target){
        if (nums.length == 0){
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (nums[i] == target){
                return true;
            }
        }
        return false;
    }

    // search the target and return the element
    static int linearSearch1(int[] nums, int target){
        if (nums.length == 0){
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    // search the target and return the index
    static int linearSearch2(int[] nums, int target){
        if (nums.length == 0){
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }
}
