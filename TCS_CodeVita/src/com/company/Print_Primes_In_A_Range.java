package com.company;

import java.util.ArrayList;

public class Print_Primes_In_A_Range {
    public static void main(String[] args) {
        int m = 2;
        int n = 5;
        System.out.println(primeRange(m, n));
    }
    private static ArrayList<Integer> primeRange(int M, int N) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }

    private static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        for (int div = 2; div*div <= n; div++) {
            if (n%div==0) {
                return false;
            }
        }
        return true;
    }
}
