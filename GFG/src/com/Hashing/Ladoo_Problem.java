package com.Hashing;

// https://practice.geeksforgeeks.org/problems/ladoo-problem2929/1/?category[]=Hash&category[]=Hash&difficulty[]=-2&difficulty[]=-1&page=2&query=category[]Hashdifficulty[]-2difficulty[]-1page2category[]Hash
// Ladoo problem

import java.util.HashMap;
import java.util.HashSet;

public class Ladoo_Problem {
    public static void main(String[] args) {
        int N = 5;
        int[] A = {3, 3, 1, 2, 4};
        System.out.println(divideLaddo(N, A));
    }

    private static int divideLaddo(int n, int[] a) {

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            hs.add(a[i]);
        }
        return hs.size();
    }
}
