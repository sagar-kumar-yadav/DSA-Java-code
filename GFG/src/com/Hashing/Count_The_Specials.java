package com.Hashing;

import java.util.HashMap;

public class Count_The_Specials {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int[] a = {1, 4, 1, 2, 4};
        countSpecials(a, k, n);
    }

    private static void countSpecials(int[] a, int k, int n) {

        // create a hashmap
        HashMap<Integer, Integer> hm = new HashMap<>();

        int count = 0;
        for (int i = 0; i < n; i++) {

            if (hm.get(a[i]) == null){
                hm.put(a[i], 1);
            }
            else {
                count = hm.get(i);
                count++;
                hm.put(a[i], count);
            }
        }
    }
}
