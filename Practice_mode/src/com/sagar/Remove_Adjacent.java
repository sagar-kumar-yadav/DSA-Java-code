package com.sagar;

import java.util.Scanner;

public class Remove_Adjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(calculate(arr, n));
        }
    }

    private static int calculate(int[] arr, int n) {
        int ans = 0;
        if (n <= 2) {
            return 1;
        }


        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i+1]) {
                return 0;
            }else {
                if (max == (arr[i] + arr[i+1])) {
                    ans++;
                }
            }
        }
        return ((arr.length-1) - ans);
    }
}
