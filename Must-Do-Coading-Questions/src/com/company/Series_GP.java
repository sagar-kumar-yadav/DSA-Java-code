package com.company;

import java.util.Scanner;

public class Series_GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
//        System.out.println(Nth_term(a, r, n));

        System.out.println(Nth_term1(a, r, n));
    }

    private static int Nth_term(int a, int r, int n) {
        int mod= 1000000007;
        long S = (long) (a * (Math.pow(r,n-1))%mod);

        return (int) S;
    }

    private static int Nth_term1(int a, int r, int n) {
        int An = a * power(r, n);
        return An;
    }

    static int power(int r, int n) {
        int power = 1;
        for (int i = 1; 1 < n; i++) {
            power = power * r;
        }
        return power;
    }
}