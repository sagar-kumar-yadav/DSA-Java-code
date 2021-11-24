package com.sagar;

// https://www.hackerrank.com/challenges/30-sorting/problem?isFullScreen=true
// Day 20: Sorting

import java.util.Arrays;
import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
    }

    private static void sort(int[] arr) {
        int countSwap = 0;
        for (int i = 0; i < arr.length-1; i++) {

            boolean swapped = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    swapped = true;
                    countSwap++;
                }
            }
            if (!swapped){
                break;
            }
        }
        System.out.println("Array is sorted in "+countSwap+" swaps.");
        System.out.println("First Element: "+arr[0]);
        System.out.println("Last Element: "+arr[arr.length-1]);
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
