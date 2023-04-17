package com.Arrays;

import java.util.HashMap;
import java.util.Map;

class Find_the_element_that_appears_once
{
    public static void main(String[] args) {
        int[] arr = {2, 2, 5, 5, 20, 30, 30};
        int n = 7;
//        System.out.println(search(arr, n));
//        System.out.println(search1(arr, n));
        System.out.println(search2(arr, n));
    }

    // brute force approach
    public static int search(int A[], int N)
    {
        // your code here
        for (int i = 0; i < N; i++) {
            int num = A[i];

            int count = 0;
            for (int j = 0; j < N; j++) {
                if (A[j] == num) {
                    count++;
                }
            }
            if (count == 1) return num;
        }
        return -1;
    }

    // better approach using hashing
    public static int search1(int[] arr, int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        int[] hash = new int[max + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int search2(int[] arr, int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = hm.getOrDefault(arr[i], 0);
            hm.put(arr[i], val+1);
        }

        for (Map.Entry<Integer, Integer> it : hm.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
        return -1;
    }
}