package com.String.Basic;

// https://practice.geeksforgeeks.org/problems/change-the-string3541/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&difficulty[]=-1&page=1&query=category[]StringsproblemStatusunsolveddifficulty[]-1page1category[]Strings
// Change the string

public class Change_The_String {
    public static void main(String[] args) {
        String S = "Abcd";
        System.out.println(modify(S));
    }

    private static String modify(String s) {
        if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z'){
            return s.toLowerCase();
        }
        else {
            return s.toUpperCase();
        }
    }
}
