package com.assignment;

import java.util.*;

public class Second_Largest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 35, 1, 10, 34, 1};
        int n = 6;


//        int[] arr = {642, 642, 642, 642, 642 ,642, 642, 642, 642, 642, 642, 642, 642, 642, 642, 642, 642, 642, 642, 642, 642};
//        int n = 21;
//        System.out.println(print2largest(arr, n));
        print2largest1(arr, n);
    }
    static int print2largest(int arr[], int n) {
        // code here
//        int max = -1 ;
        int max = arr[0];
        int secMax = -1;
        for (int i=0; i< arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            }
            else if(arr[i] < max && arr[i] > secMax) {
                secMax = arr[i];
            }
        }
        return secMax;

    }

        /////////////////////////////////////////////////////////////
        static void print2largest1(int arr[], int n) {
        Set<Integer> set = new HashSet<>();
        int j = 0;
        int arrLength = arr.length;
        while (j < arrLength) {
            int i = arr[j];
            set.add(i);
            j++;
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        if (list.size() < 2) {
            System.out.println("Second largest distinct element does not exist");
        } else {
            System.out.println("Second largest distinct element is: " + list.get(list.size() - 2));
        }
    }
}
