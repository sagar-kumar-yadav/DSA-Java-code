package com.recursion;

// https://practice.geeksforgeeks.org/problems/subset-sums2234/1/?category[]=Recursion&category[]=Recursion&problemStatus=unsolved&difficulty[]=-2&difficulty[]=-1&page=1&query=category[]RecursionproblemStatusunsolveddifficulty[]-2difficulty[]-1page1category[]Recursion

import java.util.*;

public class Subset_Sums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
        }

        ArrayList<Integer> ans = subsetSums(arr, arr.size());
        Collections.sort(ans);
        for (int sum : ans) {
            System.out.print(sum +" ");
        }
        System.out.println();
    }
    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> curr = new ArrayList<>();
        subsetSum(arr, 0, N, 0, curr);

        return curr;
    }

    private static void subsetSum(ArrayList<Integer> arr, int left, int n, int sum, ArrayList<Integer> curr) {
        if (left == arr.size()) {
            curr.add(sum);
            return;
        }

        // Subset including arr[left]
        subsetSum(arr, left + 1, n, sum + arr.get(left), curr);

        // Subset excluding arr[left]
        subsetSum(arr, left+1, n, sum, curr);
    }
}
