package com.company;

import java.util.Scanner;

public class Armstrong_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstrongNumber(n));
    }
    static String armstrongNumber(int n) {
        int k = n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += Math.pow(rem, 3);
            n = n / 10;
        }

        if (sum == k) {
            return "Yes";
        }
        else {
            return "No";
        }
    }
}
