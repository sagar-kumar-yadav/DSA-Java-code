package com.Assignment;

// https://leetcode.com/problems/search-insert-position/
// 35. Search Insert Position

public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }

    private static int searchInsert(int[] nums, int target) {
     /*
        // bruteforce
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target ){
                return i;
            }
        }
        return nums.length;
*/
        // binary search
        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (nums[mid] > target){
                end = mid -1;
            }
            else if (nums[mid] < target){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
