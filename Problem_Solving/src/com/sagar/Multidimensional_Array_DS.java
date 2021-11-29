package com.sagar;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional_Array_DS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        for (int row = 0; row < arr.length; ++row) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
    }
    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int total = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                total = arr[row][col] + arr[row][col+1] + arr[row][col+2];
                total += arr[row+1][col+1];
                total += arr[row+2][col] + arr[row+2][col+1]
            }
        }
    }
}