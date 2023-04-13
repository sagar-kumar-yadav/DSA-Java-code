package com.Arrays.School;

public class Perfect_Arrays {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 2, 1};                // output:- perfect
//        int[] arr = {1, 2, 3, 4, 5};                  // output:- Not Perfect

        if (IsPerfect(arr, n)) {
            System.out.println("Perfect");
        }else {
            System.out.println("Not Perfect");
        }
    }
    public static boolean IsPerfect(int a[], int n) {
        int i = 0;
        int j = n-1;
        while (i < j) {
            if (a[i] != a[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
