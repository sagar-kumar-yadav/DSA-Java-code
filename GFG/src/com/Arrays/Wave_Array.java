package com.Arrays;

// https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1/?category[]=Arrays&category[]=Arrays&problemStatus=solved&difficulty[]=0&page=1&query=category[]ArraysproblemStatussolveddifficulty[]0page1category[]Arrays
// Wave Array

import java.util.Arrays;

public class Wave_Array {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {2, 4, 7, 8, 9, 11};
        convertToWave(arr, n);
    }
    static void convertToWave(int[] arr, int n) {
            for (int i = 0; i < n - 1; i += 2) {
            arr[i] = arr[i] ^ arr[i + 1];
            arr[i + 1] = arr[i] ^ arr[i + 1];
            arr[i] = arr[i] ^ arr[i + 1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
