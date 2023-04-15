package com.assignment;

import java.util.*;

public class Union_Of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int n = 2;
        int m = 8;
        int[] arr1 = {1, 35};
        int[] arr2 = {6, 9, 13, 15, 20, 25, 29, 46};
        System.out.println(findUnion(arr1, arr2, n, m));
    }
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            s.add(arr2[i]);
        }
        Iterator<Integer> iterator = s.iterator();
        while (iterator.hasNext()) {
            int it = iterator.next();
            list.add(it);
        }
        Collections.sort(list);
        return list;
    }
}
