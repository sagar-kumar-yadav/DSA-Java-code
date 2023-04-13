package com.company;

import java.util.Scanner;

public class Series_Ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(nthTermOfAP(a1, a2, n));
    }
    static int nthTermOfAP(int A1, int A2, int N) {
        int d = A2 - A1;
        return A1+(N - 1) * d;
    }
}