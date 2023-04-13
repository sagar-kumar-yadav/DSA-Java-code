package com.company.oneweekprepration;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Diagonal_Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(diagonalDifference(arr));
    }
//    public static int diagonalDifference(List<List<Integer>> arr) {
//        // Write your code here
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int row = 0; row < arr.size(); row++) {
//            for (int col = 0; col < arr.get(row).size(); col++) {
//                sum1 = arr.get(row).get(col) + arr.get(row+1).get(col+1) + arr.get(row+2).get(col+2);
//                sum2 = arr.get(row).get(col+2) + arr.get(row+1).get(col+1) + arr.get(row+2).get(col);
//            }
//        }
//        int diff = sum2 - sum1;
//        return diff;

    public static int diagonalDifference(int[][] arr){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length-1; j++) {
                sum1 = arr[i][j] + arr[i+1][j+1] + arr[i+2][j+2];
                sum2 = arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j];
                break;
            }
            break;
        }
        int diff = sum1 - sum2;
        return diff;
    }
}
