package com.sagar;

import java.util.Arrays;
import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        maxDiff(arr);

    }

    private static void maxDiff(int[] arr) {
        Arrays.sort(arr);
        int maxdiff = arr[arr.length-1] - arr[0];
        System.out.println(maxdiff);
    }
}
