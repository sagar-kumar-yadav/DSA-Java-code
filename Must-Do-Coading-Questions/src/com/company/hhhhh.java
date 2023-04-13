package com.company;

import java.util.Arrays;

public class hhhhh {
    public static void main(String[] args) {
        int n = 5;
        int k = 8;
        System.out.println(Solution(n, k));
    }

    private static int Solution(int n, int k) {
        int[] arr = new int[k];
        int sum = 0;
//        for (int i = 0; i < k; i++) {
//            arr[i] = i;
//        }
//        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double ans = ((double) sum /(double) 100);
        return (int) ans;
    }
}
