package com.sagar.assignment;

// Recursive Insertion Sort
// https://www.geeksforgeeks.org/recursive-insertion-sort/

import java.util.Arrays;

public class Recursive_Insertion_Sort {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
//        insertionSort(arr, arr.length);
        insertionSortRecursive(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // iterative approach
    private static void insertionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    // recursive approach
    private static void insertionSortRecursive(int[] arr, int n) {
        // base case
        if (n <= 1) {
            return;
        }

        insertionSortRecursive(arr, n-1);

        int last = arr[n-1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
}
