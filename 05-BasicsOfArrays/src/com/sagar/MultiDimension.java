package com.sagar;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        int col;
        for(int row = 0; row < arr.length; ++row) {
            for(col = 0; col < arr[row].length; ++col) {
                arr[row][col] = in.nextInt();
            }
        }

        int[][] var7 = arr;
        col = arr.length;

        for(int var5 = 0; var5 < col; ++var5) {
            int[] a = var7[var5];
            System.out.println(Arrays.toString(a));
        }

    }
}
