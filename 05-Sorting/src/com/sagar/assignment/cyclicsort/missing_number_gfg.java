package com.sagar.assignment.cyclicsort;

public class missing_number_gfg {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3};
        int N = 4;
//        System.out.println(missingNum(arr, N));
//        System.out.println(missingNum1(arr, N));
//        System.out.println(missingNum2(arr, N));
        System.out.println(missingNum3(arr, N));
    }
    public static int missingNum(int A[], int N) {
        for (int i = 1; i <= N; i++) {
            int flag = 0;
            for (int j = 0; j < N-1; j++) {
                if (A[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) return i;
        }
        return -1;
    }

    static int missingNum1(int[] arr, int n) {
        int[] hash = new int[n+1];

        for (int i = 0; i < n - 1; i++) {
            hash[arr[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    static int missingNum2(int[] arr, int n) {
        int sum = (n * (n + 1)) / 2;

        int s2 = 0;
        for (int i = 0; i < n - 1; i++) {
            s2 += arr[i];
        }
        int missingNum = sum - s2;
        return missingNum;
    }

    static int missingNum3(int[] arr, int n) {
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < n-1; i++) {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i + 1);
        }
        xor1 = xor1 ^ n;
        return (xor1 ^ xor2);
    }
}
