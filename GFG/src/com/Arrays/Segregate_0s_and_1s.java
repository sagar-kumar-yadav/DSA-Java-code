package com.Arrays;

import java.util.Arrays;

public class Segregate_0s_and_1s {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {0, 0, 1, 1, 0};
        segregate0and1(arr, n);
    }

    private static void segregate0and1(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for (int i = count; i < n; i++) {
            arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
