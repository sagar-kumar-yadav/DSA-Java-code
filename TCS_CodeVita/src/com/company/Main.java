package com.company;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(countprime(n));
    }

    private static int countprime(int n) {
        int count = 0;
        // store prime numbers
        Vector<Integer> PrimeVector = new Vector<>();

        for (int i = 2; i <= n; i++) {
            // if i is prime
            if (isPrm(i) == 1) {
                PrimeVector.add(i);
            }
        }

        // Initialize the sum
        int sum = PrimeVector.elementAt(0);

        // Find all required primes upto N
        for (int i = 1; i < PrimeVector.size(); i++) {
            // Add it to the sum
            sum += PrimeVector.elementAt(i);
            if (sum > n) {
                break;
            }
            if (isPrm(sum) == 1) {
                count++;
            }
        }
        return count;
    }

    private static int isPrm(int n) {
        // Base case
        if (n <= 1) {
            return 0;
        }
        if (n <= 3) {
            return 1;
        }
        if (n%2==0 || n %3==0) {
            return 0;
        }

        // Iterate till [5, Math.sqrt(N)]
        // to detect primality of numbers
        for (int i = 5; i * i <= n; i = i + 6) {
            // If N is divisible by i
            // or i + 2
            if (n % i == 0 || n % (i + 2) == 0) {
                return 0;
            }
        }

        // Return 1 if N is prime
        return 1;
    }
}
