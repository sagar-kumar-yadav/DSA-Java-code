package com.Arrays.company;

// https://practice.geeksforgeeks.org/problems/a512e4b2e812b6df2159b19cc7090ffc1ab056dd/1/?page=1&query=page1
// Maximum XOR subarray

public class Maximum_XOR_Subarray {
    public static void main(String[] args) {
        int N = 2;
        int[] arr = {4, 6};
        System.out.println(maxSubarrayXOR(N, arr));
    }

    private static int maxSubarrayXOR(int N, int[] arr) {
        int maxXor = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int currMax = 0;
            for (int j = i; j < N; j++) {
                currMax = currMax ^ arr[j];
                maxXor = Math.max(maxXor, currMax);
            }
        }
        return maxXor;
    }
}
