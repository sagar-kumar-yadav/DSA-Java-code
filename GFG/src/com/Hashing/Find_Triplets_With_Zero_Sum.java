package com.Hashing;

import java.util.Arrays;

public class Find_Triplets_With_Zero_Sum {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        System.out.println(findTriplets(arr));
    }

    // solution :- 1
    private static boolean findTriplets(int[] arr) {
        boolean flag = false;
        for (int i=0; i< arr.length-2; i++) {
            for (int j =i+1; j< arr.length-1; j++) {
                for (int k=j+1; k< arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        return flag = true;
                    }
                }
            }
        }
        return false;
    }
}
