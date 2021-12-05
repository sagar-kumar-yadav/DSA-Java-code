package com.company;

// https://practice.geeksforgeeks.org/problems/find-the-camel3348/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&difficulty[]=-2&page=1&query=category[]StringsproblemStatusunsolveddifficulty[]-2page1category[]Strings
// Count of camel case characters

import java.util.Locale;

public class Count_Of_Camel_Case_Char {
    public static void main(String[] args) {
        String S = "ckjkUUYII";
        System.out.println(countCamelCase(S));
    }
    static int countCamelCase(String s){
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                ans++;
            }
        }
        return ans;
    }
}
