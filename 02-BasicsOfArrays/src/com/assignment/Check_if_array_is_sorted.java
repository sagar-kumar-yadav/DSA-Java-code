package com.assignment;

public class Check_if_array_is_sorted {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = 5;
        System.out.println(arraySortedOrNot(arr, n));
    }
    static boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
