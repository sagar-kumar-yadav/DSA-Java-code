package com.Must_Do_Coding_Questions;

// https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1
// Rotate Array

import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int n = 5;
        int d = 2;
        int[] arr = {1, 2, 3, 4, 5};
        rotateArray(arr, n, d);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotateArray(int[] arr, int n, int d) {
        int[] temp = new int[d];            // 1 , 2
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i+d];               // 3, 4, 5, 4, 5
        }

        for (int i = 0; i < d; i++) {
            arr[n-d+i] = temp[i];           // 3, 4, 5, 1, 2
        }
    }
}
