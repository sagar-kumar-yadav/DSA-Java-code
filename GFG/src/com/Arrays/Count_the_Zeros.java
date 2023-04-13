package com.Arrays;

// https://practice.geeksforgeeks.org/problems/count-the-zeros2550/1/?category[]=Arrays&category[]=Arrays&problemStatus=unsolved&difficulty[]=0&page=1&query=category[]ArraysproblemStatusunsolveddifficulty[]0page1category[]Arrays
// Count the Zeros

public class Count_the_Zeros {
    public static void main(String[] args) {
        int n = 12;
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        System.out.println(countZeros(arr, n));
    }

    private static int countZeros(int[] arr, int n) {
        int count = 0;
        for (int i=0; i<n; i++){
            if (arr[i] == 0){
                count++;
            }
        }
        return count;
    }
}
