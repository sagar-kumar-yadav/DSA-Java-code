package com.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse_array_in_groups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int k = 3;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        reverseInGroups(arr, n, k);
    }

    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int i;
        for (i = 0; i+k < n; i=i+k) {
            int start = i;
            int end = i + k - 1;
            swap(arr, start, end);
        }
        if (i+k!=n-1){
            swap(arr, i, n-1);
        }
    }
    static void swap(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            Collections.swap(arr, start, end);
            start++;
            end--;
        }
    }
}
