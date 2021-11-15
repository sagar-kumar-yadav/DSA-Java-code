package com.sagar;

// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
// 1252. Cells with Odd Values in a Matrix

public class Cells_With_Odd_Values_In_Matrix {
    public static void main(String[] args) {
        int[][] indices = {
                {0, 1},
                {1, 1}
        };
        int m = 2;
        int n = 3;
        System.out.println(oddCells(m, n, indices));
    }
    static int oddCells(int m, int n, int indices[][]){

        int[][] ans = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            // row is constant
            for (int j = 0; j < n; j++) {
                ans[indices[i][0]][j]++;
            }
            // col is constant
            for (int j = 0; j < m; j++) {
                ans[j][indices[i][1]]++;
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] % 2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
}
