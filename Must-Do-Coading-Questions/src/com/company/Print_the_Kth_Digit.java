package com.company;

import java.util.Scanner;

public class Print_the_Kth_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(kthDigit(A, B, K));
    }
    static long kthDigit(int A,int B,int K) {
        long pow = (long) Math.pow(A, B);

        long rem = 0;
        while (K > 0) {
            rem = pow % 10;
            pow /= 10;
            K--;
        }
        return rem;
    }
}
