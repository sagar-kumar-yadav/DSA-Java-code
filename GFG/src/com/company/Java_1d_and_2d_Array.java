package com.company;

// https://practice.geeksforgeeks.org/problems/java-1-d-and-2-d-array2952/1/?category[]=Arrays&category[]=Arrays&problemStatus=unsolved&difficulty[]=-1&page=1&query=category[]ArraysproblemStatusunsolveddifficulty[]-1page1category[]Arrays
// Java 1-d and 2-d Array

import java.util.*;

public class Java_1d_and_2d_Array {
    public static void main(String[] args) {
        int n = 3;
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] b = {3, 6, 9};
        System.out.println(array(a, b, n));
    }
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int dSum = 0;
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if (row==col){
                    dSum += a[row][col];
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < b[i]){
                max = b[i];
            }
        }
        ans.add(dSum);
        ans.add(max);
        return ans;
    }
}
