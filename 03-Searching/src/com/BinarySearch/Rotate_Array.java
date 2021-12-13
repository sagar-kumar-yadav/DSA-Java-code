package com.BinarySearch;

// https://leetcode.com/problems/rotate-array/
// Q.  Rotate Array
public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = -3;
        rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void rotate(int[] arr, int k){
        k = k % arr.length;

        if (k < 0){                 // if k is negative
            k += arr.length;
        }
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
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
