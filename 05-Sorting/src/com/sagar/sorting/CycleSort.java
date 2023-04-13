package com.sagar.sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            // check weather this is correct index is not
            int correct = arr[i]-1;

            // check weather this correct index is equal to 'i' or not if it is not equal swap
            if (arr[correct] != arr[i]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
