package com.company;

import java.util.Scanner;

public class GCD_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
//        System.out.println(gcd(A, B));
        System.out.println(gcd1(A, B));
    }

    private static int gcd1(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd1(b, a%b);
    }

    public static int gcd(int A , int B) {
        if (A == 0) {
            return B;
        }
        if (B == 0) {
            return A;
        }

        if (A == B) {
            return A;
        }

        // A is greater
        if (A > B) {
            return gcd(A-B, B);
        }
        return gcd(A, B-A);

    }
}
