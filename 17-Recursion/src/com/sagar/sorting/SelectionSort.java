package com.sagar.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5};

        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr, int right, int left, int max) {
        // base case
        if (right == 0){
            return;
        }
        if (right > left){

            if (arr[left] > arr[max]){
                selection(arr, right, left+1, left);
            }
            else {
                selection(arr, right, left + 1, max);
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[right-1];
            arr[right-1] = temp;
            selection(arr, right-1, 0, 0);
        }
    }
}
