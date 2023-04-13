package sagar;

// https://leetcode.com/problems/spiral-matrix/

import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}
        };
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        // if matrix length is zero return empty list
        if (matrix.length == 0) {
            return ans;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        int left = 0;
        int right = col-1;
        int top = 0;
        int bottom = row-1;
        int dir = 0;

        while (left <= right && top <= bottom) {
            // Traverse Right
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    ans.add(matrix[top][i]);
                }
                dir=1;top++;
            }
            // Traverse Down
            else if (dir==1) {
                for (int i = top; i <= bottom; i++) {
                    ans.add(matrix[i][right]);
                }
                dir=2;right--;
            }
            // Traverse Left
            else if (dir==2) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                dir=3;bottom--;
            }
            // Traverse Up
            else if (dir==3){
                for (int i = bottom; i >=top ; i--) {
                    ans.add(matrix[i][left]);
                }
                dir=0;left++;
            }
        }
        return ans;
    }
}
