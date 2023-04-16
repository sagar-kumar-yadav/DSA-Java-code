package com.Arrays;

public class Maximize_Number_of_1s {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
        int n = 13;
        int m = 2;
        System.out.println(findZeroes(arr, n, m));
    }
    static int findZeroes(int arr[], int n, int m) {
        int ans = 0;

        int j = -1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }

            while (count > m) {
                j++;
                if (arr[j] == 0) {
                     count--;
                }
            }
            int len = i - j;
            if (len > ans) {
                ans = len;
            }
        }
        return ans;
    }
}
