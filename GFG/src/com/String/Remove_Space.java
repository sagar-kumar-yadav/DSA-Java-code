package com.String;
// https://practice.geeksforgeeks.org/problems/remove-spaces0128/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&difficulty[]=-2&page=1&query=category[]StringsproblemStatusunsolveddifficulty[]-2page1category[]Strings
// Remove Spaces

public class Remove_Space {
    public static void main(String[] args) {
        String S = "geeks   for geeks";
        System.out.println(modify(S));
    }

    private static String modify(String S) {
        String ans = "";

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != ' '){
                ans = ans + S.charAt(i);
            }
        }
        return ans;
    }
}
