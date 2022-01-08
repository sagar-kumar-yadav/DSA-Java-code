package com.sagar.assignment;

// https://leetcode.com/problems/binary-search/
// Binary Search

class Binary_Search {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        return BinarySearch(nums, target, start, end);
    }

    private static int BinarySearch(int[] nums, int target, int start, int end) {

        // base case
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (nums[mid] == target){
            return mid;
        }

        if (target < nums[mid]){
            return BinarySearch(nums, target, start, mid-1);
        }
        return BinarySearch(nums, target, mid+1, end);
    }
}