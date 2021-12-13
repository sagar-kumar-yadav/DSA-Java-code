package com.assignment;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// 1295. Find Numbers with Even Number of Digits

public class Find_Numbers_With_Even_Number_Of_Digits {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

    private static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (check(nums[i])){
                count++;
            }
        }
        return count;
    }
    // function to check whether a number contains even digits or not
    static boolean check(int num){

        int count = 0;
        while (num > 0){
            int rem = num % 10;
            count++;
            num = num / 10;
        }
        if (count % 2 == 0){
            return true;
        }
        return false;
    }
}
