package com.company;

// https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0/?category[]=Arrays&category[]=Arrays&problemStatus=unsolved&page=1&query=category[]ArraysproblemStatusunsolvedpage1category[]Arrays
// Rotate Array

import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            rotateArray(arr, n, d);
        }
    }


    static void rotateArray(int[] arr, int n, int d){
    /*
        int[] ans = new int[n];
        for (int i = 0; i < n - d; i++) {
            ans[i] = arr[i + d];
        }

        for (int i = 0; i < d; i++) {
            ans[n - d + i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

   */

        for (int i = 0; i < d; i++) {
            rotateByOne(arr, n);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    private static void rotateByOne(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n-1] = temp;
    }
}
