package com.sagar.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};

        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int[] arr, int right, int left) {
        // base case
        if (right == 0){
            return;
        }
        if (right > left){

            if (arr[left] > arr[left+1]){
                //swap
                int temp = arr[left];
                arr[left] = arr[left + 1];
                arr[left + 1] = temp;
            }

            bubble(arr, right, left+1);
        }
        else {
            bubble(arr, right-1, 0);
        }
    }
}
