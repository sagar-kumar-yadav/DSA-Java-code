package com.company;

public class PrimeNumber_In_a_given_range_1 {
    public static void main(String[] args) {
        int lower = 1;
        int upper = 20;

        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        int count = 0;

        // 0, 1 negatives number are not prime
        if (n < 2) {
            return false;
        }

        // checking the number of divisors b/w 1 and the number n-1
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
