package com.company;

import java.util.Scanner;

public class Sarthak_and_his_Set_of_Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] s = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextInt();
            }
            calculate(n, m, s);
        }
    }

    private static void calculate(int n, int m, int[] arr) {
        int count = 0;
        for (int i = 1; i <= m; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c = c + 1;
                }
            }
            if (c == 2 && i < m) {
                count++;
            }
        }
        System.out.println(count);
    }
}