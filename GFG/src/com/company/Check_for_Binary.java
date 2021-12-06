package com.company;

// https://practice.geeksforgeeks.org/problems/check-for-binary/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&difficulty[]=-2&page=1&query=category[]StringsproblemStatusunsolveddifficulty[]-2page1category[]Strings
// Check for Binary

public class Check_for_Binary {
    public static void main(String[] args) {
        String str = "101";
        System.out.println(isBinary(str));
    }

    private static boolean isBinary(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '2' && str.charAt(i) <= '9'){
                return false;
            }
        }
        return true;
    }
}
