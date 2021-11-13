package com.sagar;

import java.util.Scanner;

public class TwoD1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];

        int row;
        int col;
        for(row = 0; row < arr.length; ++row) {
            for(col = 0; col < arr[row].length; ++col) {
                arr[row][col] = sc.nextInt();
            }
        }

        for(row = 0; row < arr.length; ++row) {
            for(col = 0; col < arr[row].length; ++col) {
                System.out.print(arr[row][col] + " ");
            }

            System.out.println();
        }

    }
}
