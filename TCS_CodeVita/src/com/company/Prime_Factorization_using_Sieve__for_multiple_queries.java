package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Prime_Factorization_using_Sieve__for_multiple_queries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findPrimeFactors(n);
    }

    private static void findPrimeFactors(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i*i <= isPrime.length; i++) {
            if (isPrime[i] == true) {
                // making multiples not prime
                for (int j = i+i; j < isPrime.length; j+=i) {
                    isPrime[j] = false; // not prime
                }
            }
        }

        // print all prime till n
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i] == true) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}
