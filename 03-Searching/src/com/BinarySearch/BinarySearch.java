package com.BinarySearch;
// https://leetcode.com/problems/binary-search/
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-12, -1, 0, 2, 3, 4, 15, 16, 35, 56};
        int target = -12;
        System.out.println(binarySearch(arr, target));

    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            // find the middle element
            int mid = start + (end - 1)/2;

            if (arr[mid] > target){
                end = mid -1;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
