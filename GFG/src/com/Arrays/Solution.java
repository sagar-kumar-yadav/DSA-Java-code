package com.Arrays;

import java.util.Arrays;

class Solution
{
    public static void main(String[] args) {
        int N = 5;
        int[] A = {1, 0, 1, 1, 0};
        binSort(A, N);
    }

    static void binSort(int A[], int N){
        int x = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] < 1){
                A[x] = 0;
                
            }
        }
    }
}

