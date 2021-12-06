package com.company;

// https://practice.geeksforgeeks.org/problems/multiply-left-and-right-array-sum1555/1/?category[]=Arrays&category[]=Arrays&problemStatus=unsolved&difficulty[]=-1&page=1&query=category[]ArraysproblemStatusunsolveddifficulty[]-1page1category[]Arrays
// Multiply left and right array sum.

public class Multiply_Left_And_Right_Sum {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 2, 3, 4};
        System.out.println(multiply(arr, n));
    }

    private static int multiply(int[] arr, int n) {
        int leftSum = 0;
        for (int i = 0; i < n/2; i++) {
            leftSum += arr[i];
        }
        int rightSum = 0;
        for (int i = n/2; i < n; i++) {
            rightSum += arr[i];
        }
        return rightSum * leftSum;
    }
}
