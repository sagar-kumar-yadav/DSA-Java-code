package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calculate(n);
    }

    private static void calculate(int n) {
        int rem= 0;
        int div = 0;
        int sum = 0;
        while (n != 0) {
            rem = n % 10;
            sum += rem;
            n = n / 10;
        }
//        int ans = sum / 3;
        if (n%sum == 0){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
    }
}
