package com.Must_Do_Coding_Questions;

// https://practice.geeksforgeeks.org/problems/b6b608d4eb1c45f2b5cace77c4914f302ff0f80d/1/
// Smallest Positive Integer that can not be represented as Sum

import java.util.Arrays;

public class Smallest_Positive_Integer_that_can_not_be_represented_as_Sum {
    public static void main(String[] args) {
        long[] arr = {1, 1, 1};
        int N = 3;
        System.out.println(smallestPositive(arr, N));
    }
    static long smallestPositive(long[] array, int n){

        Arrays.sort(array);

        long ans = 1;

        int i = 0;
        while (i < n && array[i] <= ans){
            ans = ans + array[i++];
        }
        return ans;
    }
}
