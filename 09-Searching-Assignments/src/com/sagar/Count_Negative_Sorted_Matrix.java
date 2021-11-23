package com.sagar;

// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
// 1351. Count Negative Numbers in a Sorted Matrix

public class Count_Negative_Sorted_Matrix {
    public static void main(String[] args) {
        int[][] grid = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };
        System.out.println(countNegative(grid));
    }

    private static int countNegative(int[][] grid) {
    /*
        // bruteforce
        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] < 0){
                    count++;
                }
            }
        }
        return count;
    */

        // binary search
        int row = 0;
        int col = grid[0].length-1;
        int count = 0;
        while (row < grid.length && col >= 0){
            if (grid[row][col] < 0){
                count += col+1;
            }
            else if (grid[row][col] > 0){
                row++;
            }
            else {
                col++;
            }
        }
        return count;
    }
}
