package com.sagar.assignment;

// https://www.geeksforgeeks.org/sum-triangle-from-array/
// Sum triangle from array

import java.util.Arrays;

public class Sum_triangle_from_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};              // output:- 48
        sumTriangle(arr);
    }
    static void sumTriangle(int[] arr) {
        // base case
        if (arr.length < 1) {
            return;
        }

        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            temp[i] = sum;
        }

        sumTriangle(temp);
        System.out.println(Arrays.toString(arr));
    }
}