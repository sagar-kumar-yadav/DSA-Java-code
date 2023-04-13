package com.Arrays.Easy;

import java.util.Arrays;

public class Reorganize_The_Array {
    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
        int n = 10;
        System.out.println(Arrays.toString(Rearrange(arr, n)));
    }
    public static int[] Rearrange (int arr[], int n) {
        // Complete the function
        int[] a = new int[n];
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                arr[i] = -1;
            }
        }
        return a;
    }
}
