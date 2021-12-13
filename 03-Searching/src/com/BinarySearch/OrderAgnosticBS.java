package com.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {90, 12, 4, 1, 0, -1, -12};
        int target = -12;
        System.out.println(orderAgnosticBS(arr, target));

    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
