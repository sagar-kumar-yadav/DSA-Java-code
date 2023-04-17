package com.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Longest_Sub_Array_with_Sum_K {
    public static void main(String[] args) {
        int[] a = {-13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};
        int n = 17;
        int k = 15;
//        System.out.println(lenOfLongSubarr(a, n, k));
//        System.out.println(lenOfLongSubarr1(a, n, k));
        System.out.println(lenOfLongSubarr2(a, n, k));
    }

    public static int lenOfLongSubarr(int A[], int N, int K) {
        int maxLength = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum += A[j];
                if (sum == K) {
                    maxLength = Math.max(maxLength, (j - i + 1));
                }
            }
        }
        return maxLength;
    }

    public static int lenOfLongSubarr1(int A[], int N, int K) {
        int left = 0, right = 0, currSum=0, maxLength = 0;

        while (left < N) {
            currSum += A[right];

            if (currSum == K) {
                maxLength = Math.max(maxLength, (right - left + 1));
            }

            while ((currSum > K ) && (left <= right)) {
                currSum -= A[left];
                left += 1;
            }

            right += 1;
        }
        return maxLength;
    }

    public static int lenOfLongSubarr2(int A[], int N, int K) {
        int maxLength = 0;
        int currSum = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < A.length; i++) {
            currSum += A[i];
            if (map.containsKey(currSum - K)) {
                maxLength = Math.max(maxLength, i - map.get(currSum - K));
            }
            if (!map.containsKey(currSum)) {
                map.put(currSum, i);
            }
        }
        return maxLength;
    }
}
