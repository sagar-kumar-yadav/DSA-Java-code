package com.sagar;

import java.util.Scanner;

public class TwoDSumCol {
    public TwoDSumCol() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];

        int row;
        int sumRows;
        for(row = 0; row < arr.length; ++row) {
            for(sumRows = 0; sumRows < arr[row].length; ++sumRows) {
                arr[row][sumRows] = sc.nextInt();
            }
        }

        for(row = 0; row < arr.length; ++row) {
            sumRows = 0;

            for(int col = 0; col < arr[0].length; ++col) {
                sumRows += arr[row][col];
            }

            System.out.print(sumRows + " ");
        }

    }
}
