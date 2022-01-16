package com.sagar.assignment;

// Check for balanced parenthesis without using stack
// https://www.geeksforgeeks.org/check-for-balanced-parenthesis-without-using-stack/

import java.util.Arrays;
import java.util.Scanner;

public class Check_for_balanced_parenthesis_without_using_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        System.out.println(ispar(x));
    }

    private static boolean ispar(String x) {
        char[] ch = x.toCharArray();
        int n = ch.length;
        return check(ch, n);
    }

    private static boolean check(char[] ch, int n) {
        // base case
        if (n == 0) {
            return true;
        }
        if (n == 1) {
            return false;
        }
        if (ch[0] == ')' || ch[0] == '}' || ch[0] == ']') {
            return false;
        }

        // Search for closing bracket for first
        char closing = findClosing(ch[0]);

        int count = 0;
        int i;
        for (i = 1; i < n; i++) {
            if (ch[i] == ch[0]) {
                count++;
            }
            if (ch[i] == closing) {
                if (count == 0) {
                    break;
                }
                count--;
            }
        }

        // If we did not find a closing
        if (i == n){
            return false;
        }

        // If closing bracket was next
        if (i == 1){
            return check(Arrays.copyOfRange(ch, i+1, n), n-2);
        }
        // If closing bracket was somewhere in middle.
        return check(Arrays.copyOfRange(ch, 1, n), i - 1) && check(Arrays.copyOfRange(ch, (i+1), n), n - i -1);
    }

    private static char findClosing(char c) {
        if (c == '(') {
            return ')';
        }
        if (c == '{') {
            return '}';
        }
        if (c == '[') {
            return ']';
        }
        return Character.MIN_VALUE;

    }
}
