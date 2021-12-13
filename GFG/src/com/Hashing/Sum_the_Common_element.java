package com.Hashing;

// https://practice.geeksforgeeks.org/problems/sum-the-common-elements/1/?track=module-5-sets-and-map-java&batchId=114
// 1. Sum the common elements

import java.util.HashSet;
import java.util.Iterator;

public class Sum_the_Common_element {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 5, 6, 7};
        System.out.println(commonSum(arr1, arr2));
    }

    private static long commonSum(int[] arr1, int[] arr2) {

        int sum = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])) {
                hs.remove(arr2[i]);
                sum += arr2[i];
            }
        }
        return sum;
    }
}

