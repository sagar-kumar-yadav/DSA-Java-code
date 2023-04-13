package com.company;

import java.util.Scanner;

public class Modular_Exponentiation_for_large_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(PowMod(x, n, m));
    }
    public static long PowMod(long x, long n, long m) {
        long ans = 1;
        long cal = x ^ n % m;
        ans = cal % m;
        return ans;
    }
}
