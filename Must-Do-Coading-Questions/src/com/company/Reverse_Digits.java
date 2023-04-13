package com.company;

import java.util.Scanner;

public class Reverse_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse_digit(n));
    }
    public static long reverse_digit(long n) {
        long k = n;
        long rev = 0;
        while (n > 0) {
            long rem = n % 10;
            rev = rem + rev * 10;
            n /= 10;
        }
        return rev;
    }
}
