package sagar;

public class _1752_ {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
//        int[] nums = {2,1,3,4};
//        int[] nums = {1, 1, 1};
//        int[] nums = {1, 2 ,3 ,4 ,5};
        System.out.println(check(nums));
    }
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i-1] > nums[i]) {
                count++;
            }
        }
        if (nums[n-1] > nums[0]) {
            count++;
        }
        return count<=1;
    }
}
