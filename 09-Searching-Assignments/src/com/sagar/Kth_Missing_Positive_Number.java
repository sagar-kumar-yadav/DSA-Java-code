package com.sagar;

// https://leetcode.com/problems/kth-missing-positive-number/
// 1539. Kth Missing Positive Number

public class Kth_Missing_Positive_Number {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }

    private static int findKthPositive(int[] arr, int k) {
     /*
        //bruteforce
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i] - (i + 1);
            if (x >= k){
                return i + k;
            }
        }
        return arr.length + k;

*/
        // binary search
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] - 1 - mid < k){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start + k;
    }
}
