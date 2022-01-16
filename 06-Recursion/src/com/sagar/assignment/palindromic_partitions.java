package com.sagar.assignment;

// Given a string, print all possible palindromic partitions
// https://practice.geeksforgeeks.org/problems/find-all-possible-palindromic-partitions-of-a-string/1/

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class palindromic_partitions {
    public static void main(String[] args) {
        String s = "geeks";
        allPalindromicPerms(s);
    }
    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        // code here

        ArrayList<ArrayList<String>> allPart = new ArrayList<>();
        Deque<String> currPart = new LinkedList<String>();

        partition(allPart, currPart, 0, S.length(), S);
    }

    private static void partition(ArrayList<ArrayList<String>> allPart, Deque<String> currPart, int start, int n, String s) {

        // If 'start' has reached len
        if (start >= n) {
            allPart.add(new ArrayList<>(currPart));
            return;
        }

        // Pick all possible ending points for substrings
        for (int i = start; i < n; i++) {

            // If substring str[start..i] is palindrome
            if (isPalindrome(s, start, i)) {

                // Add the substring to result
                currPart.addLast();
            }
        }
    }
}
