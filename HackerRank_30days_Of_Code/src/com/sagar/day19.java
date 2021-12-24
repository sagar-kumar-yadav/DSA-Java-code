package com.sagar;

import java.util.Scanner;

public class day19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculate(n);
    }

    private static void calculate(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                sum += i;
            }
        }
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(sum);
    }
}
