package com.Arrays;

// https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1/?category[]=Arrays&category[]=Arrays&problemStatus=unsolved&difficulty[]=0&page=1&query=category[]ArraysproblemStatusunsolveddifficulty[]0category[]Arrayspage1
// Find Transition Point

public class Find_Transition_Point {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {0, 0, 0, 1, 1};
        System.out.println(transitionPoint(arr, n));
    }

    private static int transitionPoint(int[] arr, int n) {

        // brute-force solution
      /*
       for (int i = 0; i < n; i++) {
            if (arr[i] == 1){
                return i;
            }
        }
        return -1;
        */

        // binary search
        int start = 0;
        int end = n-1;
        int tp = -1;
        while (start <= end){
            int mid = start + (end -start)/2;
            if (arr[mid] == 0){
                start = mid + 1;
            }
            else if (arr[mid] == 1) {
                tp = mid;
                end = mid - 1;
            }
        }
        return tp;
    }
}
