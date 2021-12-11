package com.Must_Do_Coding_Questions;

import java.util.Arrays;
import java.util.HashMap;

public class Majority_Element {
    public static void main(String[] args) {
        int n = 13;
        int[] arr = {9, 14, 10, 10, 1, 2, 1, 7, 10, 10, 14, 19, 9};
//        int[] arr = {1, 2, 2};
        System.out.println(majorityElement(arr, n));
    }

    private static int majorityElement(int[] a, int size) {

        // brute force
    /*  for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j]){
                    count++;
                }
            }
            if (count > size/2){
                return a[i];
            }
        }
        return -1;
*/

        // using sorting
        if (size <= 1) {
            return a[0];
        }
        Arrays.sort(a);
        ;

        int i = 1;
        while (i < size) {
            int count = 1;

            while (i < size && a[i] == a[i - 1]) {
                i++;
                count++;
            }
            if (count > size / 2) {
                return a[i - 1];
            }
            i++;
        }
        return -1;
    }
}