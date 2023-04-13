package com.BinarySearch;

// https://www.geeksforgeeks.org/ceiling-in-a-sorted-array/
// Q. ceiling in a sorted array

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 17;
        System.out.println(ceiling(arr, target));       // output = 6;
    }
    static int ceiling(int[] arr, int target){

        // if the target is greater than the greatest number in the array
        if (target > arr[arr.length -1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            // find the middle element
            int mid = start + (end - start)/2;

            if (arr[mid] > target){
                end = mid -1;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
