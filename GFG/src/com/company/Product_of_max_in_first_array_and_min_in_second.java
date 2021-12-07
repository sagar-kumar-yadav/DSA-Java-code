package com.company;

// https://practice.geeksforgeeks.org/problems/product-of-maximum-in-first-array-and-minimum-in-second3943/1
// Product of maximum in first array and minimum in second

public class Product_of_max_in_first_array_and_min_in_second {
    public static void main(String[] args) {
        int[] arr = {-6, -3};
        int[] brr = {-14, -1, 18, 8, -9, 9, -11, -15, -18, -1, -8, -1, -18, 3, -14, -6, -16, -18, -6, 3};
        System.out.println(find_multiplication(arr, brr));
    }

    private static long find_multiplication(int[] arr, int[] brr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < brr.length; i++) {
            if (min > brr[i]){
                min = brr[i];
            }
        }
        return max*min;
    }
}
