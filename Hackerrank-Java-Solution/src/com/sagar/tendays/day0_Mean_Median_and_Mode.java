package com.sagar.tendays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class day0_Mean_Median_and_Mode {
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

    private static int mode(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer, Integer> hm = new HashMap<>();

        int c = 0;
        for (int i = 0; i < arr.length; i++) {

            if (hm.get(arr[i]) == null) {
                hm.put(arr[i], 1);
            }
            else {
                c = hm.get(arr[i]);
                c++;
                hm.put(arr[i], c);
                return arr[i];
            }
        }
        return arr[0];
    }

    private static double median(int[] arr) {
        Arrays.sort(arr);

        double ans = 0;
        for (int i = 1; i <= arr.length; i++) {
            int mid = arr.length/2;
            ans = ((double) arr[mid] + (double) arr[mid - 1]) / 2;
        }
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
