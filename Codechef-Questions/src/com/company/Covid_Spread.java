package com.company;

import java.util.Scanner;

public class Covid_Spread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            double n = sc.nextInt();
            double d = sc.nextInt();
            calculate(n, d);
        }
    }

    private static void calculate(double n, double d) {
        int x = 1;
        for (int i = 1; i <= d && x < n; i++) {
            if (i < 11){
                x *= 2;
            }
            else {
                x *= 3;
            }
            if (x >= n) {
                x = (int) n;
            }
        }
        System.out.println(x);
    }
}
