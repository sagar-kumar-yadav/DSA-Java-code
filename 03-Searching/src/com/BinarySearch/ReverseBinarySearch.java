package com.BinarySearch;

//  https://leetcode.com/problems/search-in-rotated-sorted-array/
// Q, Search in Rotated Sorted Array
public class ReverseBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int target = 4;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1){
            // just do normal binary search
            return binarySearch(arr, target, 0, arr.length-1);
        }
        // if pivot is found, you have found two ascending sorted arrays
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length-1);

    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] < target){
                start = mid + 1;
            }
            else if (arr[mid] > target){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
