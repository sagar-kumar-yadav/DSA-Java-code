package com.Arrays.medium;

public class Row_with_max_1s {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        System.out.println(rowWithMax1s(arr, 4, 4));
    }

    static int rowWithMax1s(int arr[][], int n, int m) {
        int temp = 0;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > temp) {
                temp = count;
                ans = i;
            }
        }
        return ans;
    }
}
