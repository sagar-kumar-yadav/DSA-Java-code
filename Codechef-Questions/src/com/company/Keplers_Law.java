package com.company;

import java.util.Scanner;

public class Keplers_Law {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0){
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
            calculate(t1, t2, r1, r2);
        }
    }

    private static void calculate(int t1, int t2, int r1, int r2) {
        double t = Math.pow(t1, 2)/Math.pow(r1, 3);
        double r = Math.pow(t2, 2)/Math.pow(r2, 3);

        if (t == r){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
