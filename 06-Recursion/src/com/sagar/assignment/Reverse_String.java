package com.sagar.assignment;

// https://leetcode.com/problems/reverse-string/
// Reverse String

class Reverse_String {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString1(s);

        reverseString(s);
    }
    // iterative approach
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start <= end) {
            if (s[start] != s[end]) {
                char temp = s[start];
                s[start] = s[end];
                s[end] = temp;
            }
            start++;
            end--;
        }
    }

    // recursive approach
    public static void reverseString1(char[] s) {
        int start = 0;
        int end = s.length - 1;

        reverse(s, start, end);
    }

    private static void reverse(char[] s, int start, int end) {
        if (start > end) {
//            System.out.println(s);
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        reverse(s, start+1, end-1);
    }
}