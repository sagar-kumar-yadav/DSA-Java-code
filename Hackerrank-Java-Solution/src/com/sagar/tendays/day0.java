package com.sagar.tendays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class day0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        int[] arr = new int[tc];
        for (int i = 0; i < tc; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(mean(arr));
        System.out.println(median(arr));
        System.out.println(mode(arr));
    }

    private static double mode(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer, Integer> hm = new HashMap<>();

        int x = 1;
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], x);

        }
    }

    private static double median(int[] arr) {
        Arrays.sort(arr);
        double m1 = arr.length/2;
        double m2 = arr.length/2 + 1;
        double ans = (m1 + m2) / 2;
        return ans;
    }

    private static double mean(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double ans =  sum / arr.length;
        return  ans;
    }
}
