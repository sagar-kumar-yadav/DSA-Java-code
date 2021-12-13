package com.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Check_If_Two_Array_Equal_Or_Not {
    public static void main(String[] args) {
        long[] A = {20, 20, 17, 15, 19};
        long[] B = {6, 17, 20, 19, 19};
        int N = 5;
        System.out.println(check(A, B, N));
    }
    static boolean check(long[] A, long[] B, int N) {
/*
        // using sorting
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < N; i++) {
            if (A[i] != B[i]){
                return false;
            }
        }
        return true;
    }
*/

        // using hashmap
        HashMap<Long, Long> hm = new HashMap<>();

        long count = 0;
        for (int i = 0; i < N; i++) {

            // count numbers
            if (hm.get(A[i]) == null) {  // 1 --> 0;
                hm.put(A[i], 1L);       // 1 --> 1; if 1 present one time
            }
            else {
                count = hm.get(A[i]);  // count = 1; initially
                count++;               // 1+1 = 2;
                hm.put(A[i], count);   // 1 --> 2;
            }
        }

        for (int i = 0; i < N; i++) {

            // if not contains A[]
            if (!hm.containsKey(B[i])) {
                return false;
            }

            // B[] appears more times than it appears in A[]
            if (hm.get(B[i]) == 0) {
                return false;
            }
            count = hm.get(B[i]);
            --count;
            hm.put(B[i], count);
        }

        return true;


    }
}