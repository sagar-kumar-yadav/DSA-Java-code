package com.sagar;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// 167. Two Sum II - Input Array Is Sorted

import java.util.Arrays;

public class Two_Sum_2 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    private static int[] twoSum(int[] numbers, int target) {

    /*
        // bruteforce
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target){
                    return new int[]{i+1, j+1};
                }
            }
        }
        return null;
    }
     */

        // binary Search
        int start = 0;
        int end = numbers.length-1;
        while (start <= end){
            if (numbers[start] + numbers[end] == target){
                return new int[]{start+1, end+1};
            }
            else if (numbers[start] + numbers[end] > target){
                end = end - 1;
            }
            else {
                start = start + 1;
            }
        }
        return null;
    }
}
