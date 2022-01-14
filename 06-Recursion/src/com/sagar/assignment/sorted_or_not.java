package com.sagar.assignment;

// https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/
// Program to check if an array is sorted or not (Iterative and Recursive)

public class sorted_or_not {
    public static void main(String[] args) {
        int[] arr = {10, 21, 45, 89, 89, 90};
//        System.out.println(check(arr));

        System.out.println(checkRec(arr, arr.length));
    }

    // iterate approach
    private static boolean check(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }

    // recursive approach
    private static boolean checkRec(int[] arr, int n) {
        if (n == 1 || n == 0) {
            return true;
        }
        return arr[n - 1] >= arr[n - 2] && checkRec(arr, n-1);
    }
}