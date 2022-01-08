package com.sagar.assignment;

// https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
// Recursive Programs to find Minimum and Maximum elements of array

public class find_Min_and_max_element {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, -50, 10, 2};
        int n = arr.length;
        System.out.println("minimum element "+findMin(arr, n));

        System.out.println("maximum element "+findMax(arr, n));
    }

    private static int findMax(int[] arr, int n) {
        // base case
        if (n == 1) {
            return arr[0];
        }

        return Math.max(arr[n-1], findMax(arr, n-1));
    }

    private static int findMin(int[] arr, int n) {
        // base case
        if (n == 1){
            return arr[0];
        }

        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }
}
