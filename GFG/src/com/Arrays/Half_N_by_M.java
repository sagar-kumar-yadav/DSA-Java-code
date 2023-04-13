package com.Arrays;

public class Half_N_by_M {
    public static void main(String[] args) {
        int n = 100;
        int m = 4;
        System.out.println(mthHalf(n, m));
    }
    static int mthHalf(int N, int M){
        int ans = N;
        for (int i = 1; i < M; i++){
            ans = ans / 2;
        }
        return ans;

    }
}
