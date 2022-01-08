package com.company;

// https://www.codechef.com/START21C/problems/COVID_19

import java.util.Scanner;

public class Covid_And_Theater_Tickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            calculate(n, m);
        }
    }

    private static void calculate(int n, int m) {
        // if value of n is even

        if (n % 2 != 0 && m % 2 != 0){
            System.out.println((n/2 + 1) * (m/2 +1));
        }
        else if (n % 2 == 0 && m % 2 != 0){
            System.out.println((n/2) * (m/2+1));
        }
        else if ((n % 2 != 0) && (m % 2 == 0)) {
            System.out.println((n/2 + 1) * (m/2));
        }
        else {
            System.out.println((n/2) * (m/2));
        }
    }
}
