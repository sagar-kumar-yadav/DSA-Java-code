package com.sagar;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// 852. Peak Index in a Mountain Array

public class Peak_Index_In_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    private static int peakIndexInMountainArray(int[] arr) {
      /*
       // bruteforce
        int i = 0;
        while (arr[i] < arr[i+1]) {
            i++;
        }
        return i;
*/


        // binary search
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            else if (arr[mid] > arr[mid + 1]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return start;

    }
}
