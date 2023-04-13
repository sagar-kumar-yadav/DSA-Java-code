package com.company;

public class interviewQuestions {
    // Solution - 1
    public int minRepeats(String A, String B) {
        // storing A temp variable
        String temp = A;

        int ans = 1;
        while (A.length() < B.length()) {
            A += temp;
            ans++;
        }

        if (checkSub(A, B)) {
            return ans;
        }

        if (checkSub(A+temp, B)) {
            return ans+1;
        }
        return -1;
    }

    private boolean checkSub(String a, String b) {
        int n = a.length();
        int m = b.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (a.charAt(i+j) != b.charAt(j)){
                    break;
                }
            }
            if (j == m) {
                return true;
            }
        }
        return false;
    }

    // Solution - 2
    // Native approach
    public int peakElement(int n, int[] arr) {
        //
        if (arr.length == 1) {
            return -1;
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    index = j;
                }
            }
        }
        return index;
    }
}
