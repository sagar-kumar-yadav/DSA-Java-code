package com.sagar.assignment;

// https://www.geeksforgeeks.org/recursive-program-prime-number/

import java.util.Scanner;

public class Recursive_program_for_prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPrime(n, 2)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("False");
        }
    }

    private static boolean isPrime(int n, int i) {
        // base case
        if (n <= 2) {
            if (n == 2) {
                return true;
            }
            return false;
        }

        if (n % i == 0) {
            return false;
        }

        if (i * i > n) {
            return true;
        }

        return isPrime(n, i+1);
    }
}
