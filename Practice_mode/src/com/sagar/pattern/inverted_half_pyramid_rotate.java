package com.sagar.pattern;

import java.util.Scanner;

public class inverted_half_pyramid_rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        invHalfPyramidRotate(n);
    }

    private static void invHalfPyramidRotate(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
