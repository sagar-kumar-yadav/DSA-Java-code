package com.company;

import java.util.Scanner;

public class Closest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println(closestNumber(N, M));
    }
    static int closestNumber(int N , int M) {
        // find the quotient
        int Q = N / M;

        // first possible closest number
        int n1 = M * Q;

        // Second possible closest number
        int n2;
        if ((N * M) > 0) {
            n2 = M * (Q + 1);
        } else {
            n2 = M * (Q - 1);
        }

        // if true, then n1 is the required closest number
        if (Math.abs(N - n1) < Math.abs(N - n2)) {
            return n1;
        }

        // else n2 is the required closest number
        return n2;
    }
}
