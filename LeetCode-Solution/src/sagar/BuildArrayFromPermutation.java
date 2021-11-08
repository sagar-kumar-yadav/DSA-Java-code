package sagar;

import java.util.Arrays;

// https://leetcode.com/problems/build-array-from-permutation/
// Q. Build Array from Permutation
public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        int[] nums = {5, 0 ,1, 2, 3, 4};
//        System.out.println(Arrays.toString(buildArray(nums)));
        System.out.println(Arrays.toString(buildArray1(nums)));

    }
    static int[] buildArray(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    //optimise
    static int[] buildArray1(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = n * (nums[nums[i]]%n)+nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i]/n;
        }
        return nums;
    }
}
