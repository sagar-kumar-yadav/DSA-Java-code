package com.Arrays.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_duplicate_elements_from_sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1,1, 2, 2, 2};
        int n = 5;
        System.out.println(remove_duplicate(arr, n));
//        System.out.println(remove_duplicate1(arr, n));
    }
    static int remove_duplicate(int A[],int N){
        if (N == 0 || N == 1) {
            return N;
        }

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[N];
        int j = 0;

        for (int i = 0; i < N - 1; i++) {
            if (A[i] != A[i + 1]) {
                temp[j++] = A[i];
            }
        }

        temp[j++] = A[N - 1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            A[i] = temp[i];
        }

        return j;
    }

//    static int remove_duplicate1(int[] A, int N) {
//        Set<Integer> set = new HashSet<>();
//        int ans = 0;
//        for (int j = 0; j < A.length; j++) {
//            int i = A[j];
//            set.add(i);
//        }
//        return set;
//    }
}
