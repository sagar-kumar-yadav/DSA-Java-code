package com.sagar.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
//        int[] arr = {56, 3, 2, 78, 6, 0};
        int[] arr = {-2, 45, 0, 11, -9};
        int n = arr.length;
        sort(arr, n);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr, int n){
        for (int i = 0; i < n-1; i++) {

            boolean swapped = false;
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
