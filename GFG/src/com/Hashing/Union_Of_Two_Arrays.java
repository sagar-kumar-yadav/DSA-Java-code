package com.Hashing;

import java.util.HashSet;

public class Union_Of_Two_Arrays {
    public static void main(String[] args) {
        int[] a = {85, 25, 1, 32, 54, 6};
        int[] b = {85, 2};
        System.out.println(doUnion(a, b));
    }

    private static int doUnion(int[] a, int[] b) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            hs.add(b[i]);
        }
        return hs.size();
    }
}
