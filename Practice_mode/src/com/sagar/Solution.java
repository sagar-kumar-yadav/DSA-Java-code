package com.sagar;

import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {15, 2, 45, 12, 7};
        System.out.println(valueEqualToIndex(arr, n));
    }
    static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0; i<n; i++) {
            if (arr[i] == (i+1)) {
                ans.add(i+1);
            }
        }
        return ans;
    }
}