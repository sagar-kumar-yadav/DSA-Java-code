package com.company;

// https://www.codechef.com/START21C/problems/CHEFGRD

import java.util.Scanner;

public class Akash_and_Grid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            calculate(n, x, y);
        }
    }

    private static void calculate(int n, int x, int y) {

        int centerX = (n+1/2);
        int centerY = (n+1/2);

        int diffX = centerX - x;
        int diffY = centerY - y;

        int sum = diffX + diffY;
        if (sum % 2 == 0){
            System.out.println("0");
        }
        else {
            System.out.println("1");
        }
    }
}
