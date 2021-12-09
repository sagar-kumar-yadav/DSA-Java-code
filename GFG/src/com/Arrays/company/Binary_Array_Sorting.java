package com.Arrays.company;

// https://practice.geeksforgeeks.org/problems/binary-array-sorting5355/1/?category[]=Arrays&category[]=Java&category[]=Arrays&category[]=Java&problemStatus=unsolved&difficulty[]=-1&page=1&query=category[]Arrayscategory[]JavaproblemStatusunsolveddifficulty[]-1page1category[]Arrayscategory[]Java#
// Binary Array Sorting

import java.util.Arrays;

public class Binary_Array_Sorting {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1, 0, 1, 1, 0, 0, 0};
        System.out.println(Arrays.toString(SortBinaryArray(arr, n)));
    }
    static int[] SortBinaryArray(int arr[], int n) {
        int i = -1;
        int pivot = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] <= pivot){
                i++;
                swap(arr, i, j);
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
