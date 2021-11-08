package sagar;
// https://leetcode.com/problems/concatenation-of-array/
import java.util.Arrays;
// 1929. Concatenation of Array
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(concatenation(nums)));

    }
    static int[] concatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
