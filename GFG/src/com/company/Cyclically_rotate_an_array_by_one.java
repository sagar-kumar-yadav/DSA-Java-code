package com.company;

// https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1/?category[]=Arrays&category[]=Arrays&problemStatus=unsolved&difficulty[]=-1&page=1&query=category[]ArraysproblemStatusunsolveddifficulty[]-1page1category[]Arrays
// Cyclically rotate an array by one

import java.util.Arrays;

public class Cyclically_rotate_an_array_by_one {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, n);
    }

    private static void rotate(int[] arr, int n) {
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            swap(arr, i, n);
        }
    }

    private static void swap(int[] arr, int i, int n) {
        int temp = arr[i];
        arr[i] = n;
        n = temp;
    }
}
