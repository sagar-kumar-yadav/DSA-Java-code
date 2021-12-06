package com.company;

// https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/1/?category[]=Arrays&category[]=Arrays&difficulty[]=-1&page=1&query=category[]Arraysdifficulty[]-1page1category[]Arrays
// Largest Element in Array

public class Largest_Element_In_Array {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 8, 7, 56, 90};
        System.out.println(largest(arr, n));
    }

    private static int largest(int[] arr, int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
