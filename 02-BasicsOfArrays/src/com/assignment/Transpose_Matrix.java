package com.assignment;

import java.util.Arrays;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] ans = transpose(matrix);
        System.out.println(Arrays.toString(ans));
    }

    private static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}
