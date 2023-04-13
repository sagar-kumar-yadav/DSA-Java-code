package com.Arrays;

import java.util.Arrays;

class index_of_first_one_in_a_sorted_arr_of_zeros_and_ones {
    public static void main(String[] args) {
        long[] arr = {0, 0, 0, 0, 0, 0};
        long n = 6;
        System.out.println(firstIndex(arr, n));
    }
    
    public static long firstIndex(long arr[], long n) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x < arr[i]){
                return i;
            }
        }
        return -1;
    }
}