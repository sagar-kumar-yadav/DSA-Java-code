package com.company.String;

// https://practice.geeksforgeeks.org/problems/java-substring5058/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&difficulty[]=-2&page=1&query=category[]StringsproblemStatusunsolveddifficulty[]-2page1category[]Strings
// Java Substring

public class Java_Substring {
    public static void main(String[] args) {
        String S = "cdbkdub";
        int L = 0;
        int R = 5;
        System.out.println(javaSub(S, L, R));

    }
    static String javaSub(String S, int L, int R) {
        return S.substring(L, R+1);
    }
}
