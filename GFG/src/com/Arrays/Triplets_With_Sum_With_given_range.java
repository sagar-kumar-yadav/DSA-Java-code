package com.Arrays;

public class Triplets_With_Sum_With_given_range {
    public static void main(String[] args) {
        int N = 5;
        int[] Arr = {5, 1 ,4, 3, 2};
        int L = 2;
        int R = 7;
        System.out.println(countTriplets(Arr, N, L, R));
    }
    static int countTriplets(int Arr[], int N, int L, int R){
        // brute-force
       int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if (Arr[i] + Arr[j] + Arr[k] >= L && Arr[i] + Arr[j] + Arr[k] <= R){
                        count++;
                    }
                }
            }
        }
        return count;

        // two - pointer

    }
}
