package com.company;

// https://www.codechef.com/START21C/problems/ANDORUNI/

import java.util.Arrays;
import java.util.Scanner;

public class And_Or_Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
//            calculate(arr, n);
            calculate1(arr, n);
        }
    }

    // brute force
    private static void calculate(int[] arr, int n) {
        int ans = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                ans |= arr[i] & arr[j];
            }
        }
        System.out.println(ans);
    }

    // optimise
    private static void calculate1(int[] arr, int n) {
        int[] b = new int[32];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 32; j++) {
                int k = arr[i] >> j;

                if ((k & 1) == 1) {
                    b[j]++;
                }
            }
        }
        int x = 0;
        for (int i = 0; i < 32; i++) {
            if (b[i] > 1){
                x += (int) Math.pow(2, i);
            }
        }
        System.out.println(x);
    }
}
