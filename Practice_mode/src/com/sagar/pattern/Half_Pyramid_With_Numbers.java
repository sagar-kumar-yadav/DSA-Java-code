package com.sagar.pattern;

import java.util.Scanner;

public class Half_Pyramid_With_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        halfPyramidWithNumbers(n);
    }

    private static void halfPyramidWithNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
