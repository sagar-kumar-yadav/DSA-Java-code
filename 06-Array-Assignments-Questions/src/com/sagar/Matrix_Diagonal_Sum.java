package com.sagar;

// https://leetcode.com/problems/matrix-diagonal-sum/
// 1572. Matrix Diagonal Sum
public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(diagonalSum(mat));
    }

    private static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[i][n-1-i];
        }
        if (n % 2 == 0){
            return sum;
        }
        else {
            return sum - mat[n/2][n/2];
        }
    }
}
