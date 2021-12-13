package com.BinarySearch;

import java.util.Arrays;

// Q. Search element in a sorted matrix
public class Search_In_Sorted_Matrices {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29 ,37, 49},
                {33, 34, 38, 50}
        };
        int target = 33;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix[0].length-1;

        while (r < matrix.length && c >= 0){
            if (matrix[r][c] == target){
                return new int[]{r, c};
            }
            if (matrix[r][c] < target){
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
