package com.Arrays.School;

import java.util.Arrays;

public class Find_Index {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {1, 2, 3, 4, 5, 5};             // output:- 4, 5
        int key = 5;
        System.out.println(Arrays.toString(findIndex(arr, n, key)));
    }
    static int[] findIndex(int a[], int N, int key){
        int startIndex = 0;
        int endIndex = N - 1;
        for (int i = 0; i < N; i++) {
            if (a[i] == key) {
                startIndex = i;
                break;
            }else {
                startIndex = -1;
            }
        }
        for (int i = N - 1; i >= 0; i++) {
            if (a[i] == key) {
                endIndex = i;
                break;
            }else {
                endIndex = -1;
            }
        }
        int[] result = new int[2];

        result[0] = startIndex;
        result[1] = endIndex;

        return result;
    }
}
