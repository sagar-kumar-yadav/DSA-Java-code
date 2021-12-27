package com.recursion;

public class Print_1_to_n_without_using_loops {
    public static void main(String[] args) {
        int N = 5;
        printTillN(N);
    }

    private static void printTillN(int N) {
        if (N == 0) {
            return;
        }
        printTillN(N-1);
        System.out.print(N+" ");
    }
}
