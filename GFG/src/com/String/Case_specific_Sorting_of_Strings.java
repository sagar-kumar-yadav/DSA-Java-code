package com.String;

// https://practice.geeksforgeeks.org/problems/case-specific-sorting-of-strings4845/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&page=1&query=category[]StringsproblemStatusunsolvedpage1category[]Strings
// Case-specific Sorting of Strings

import java.util.Arrays;

class Case_specific_Sorting_of_Strings {
    public static void main(String[] args) {
        int n = 12;
        String s = "defRTSersUXI";
        System.out.println(caseSort(s));
    }
    public static String caseSort(String str) {
        String cap = "";
        String low = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                cap += str.charAt(i);
            }
            else {
                low += str.charAt(i);
            }
        }
        char[] a = cap.toCharArray();
        char[] b = low.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        int k = 0;
        int l = 0;
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 'A' && str.charAt(i) < 'Z'){
                ans += a[k++];
            }
            else {
                ans += b[l++];
            }
        }
        return ans;
    }
}