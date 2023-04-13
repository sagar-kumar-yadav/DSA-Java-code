package com.Arrays.School;

import java.util.Scanner;

public class Palindromic_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(palinArray(a, n));
    }

    public static int palinArray(int[] a, int n) {

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = 0;
            int orgi = a[i];
            while (a[i] != 0) {
                int dig = a[i] % 10;
                num = num * 10 + dig;
                a[i] = a[i] / 10;
            }
            if (num == orgi) {
                a[i] = 1;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                return 0;
            }
        }
        return 1;
    }
}