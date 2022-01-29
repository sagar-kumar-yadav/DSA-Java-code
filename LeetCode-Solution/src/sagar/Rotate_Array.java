package sagar;

import java.util.ArrayList;
import java.util.Arrays;

class Rotate_Array {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;

        // reverse original array
        reverse(nums, 0, nums.length-1);

        // reverse left
        reverse(nums, 0, k-1);

        // reverse right
        reverse(nums, k, nums.length-1);
    }

    static void reverse(int[] arr, int left, int right){

        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}