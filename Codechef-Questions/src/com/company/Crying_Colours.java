package com.company;

// https://www.codechef.com/JAN222C/problems/CRYCOLR

import java.util.Scanner;

public class Crying_Colours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {

            int n = sc.nextInt();

            int[][] arr = new int[3][3];
            for (int i = 0; i < 3; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
                arr[i][2] = sc.nextInt();
            }
            int ans = 0;
            if (arr[0][0] == n && arr[1][1] == n & arr[2][2] == n) {
                System.out.println(ans);
                continue;
            }
            int a = arr[1][0] + arr[2][0] + arr[2][1];
            int b = arr[0][1] + arr[0][2] + arr[1][2];
            int max = Math.max(a, b);
            System.out.println(max);
        }
    }
}
