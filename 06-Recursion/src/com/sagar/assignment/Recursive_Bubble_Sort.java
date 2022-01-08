package com.sagar.assignment;

// Recursive Bubble Sort
// https://www.geeksforgeeks.org/recursive-bubble-sort/

import java.util.Arrays;

public class Recursive_Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        sortBubble(arr, start, end);

    }

    private static void sortBubble(int[] arr, int start, int end) {
        // base case
        if (end == 0) {
            return;
        }

        if (end > start) {

            if (arr[start] > arr[start+1]) {
                // swap
                int temp = arr[start];
                arr[start] = arr[start+1];
                arr[start+1] = temp;
            }
            sortBubble(arr, start+1, end);
        }
        else {
            sortBubble(arr, 0, end-1);
        }

    }
}
