package com.sagar.pattern;

import java.util.Scanner;

public class inverted_half_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        invHalfPyramid(n);
    }

    private static void invHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
