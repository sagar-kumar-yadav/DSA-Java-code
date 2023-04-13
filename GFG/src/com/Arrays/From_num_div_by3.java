package com.Arrays;

// https://practice.geeksforgeeks.org/problems/form-a-number-divisible-by-3-using-array-digits0717/1/?category[]=Arrays&category[]=Arrays&problemStatus=unsolved&difficulty[]=0&page=1&query=category[]ArraysproblemStatusunsolveddifficulty[]0page1category[]Arrays
// Form a number divisible by 3 using array digits

public class From_num_div_by3 {
    public static void main(String[] args) {
        int N = 3;
        int[] arr = {40, 50, 90};
        System.out.println(isPossible(N, arr));
    }

    private static int isPossible(int N, int[] arr) {
        int x = 0;
        for (int i=0; i<N; i++){
            x += arr[i];
        }
        int ans = 0;
        if (x % 3 == 0){
            ans = 1;
        }
        else{
            ans = 0;
        }
        return ans;
    }
}
