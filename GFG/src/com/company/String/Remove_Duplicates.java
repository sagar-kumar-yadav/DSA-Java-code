package com.company.String;
// https://practice.geeksforgeeks.org/problems/remove-duplicates3034/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&difficulty[]=0&page=1&query=category[]StringsproblemStatusunsolveddifficulty[]0page1category[]Strings
// Remove Duplicates

public class Remove_Duplicates {
    public static void main(String[] args) {
        String S = "ZVVO";
        System.out.println(removeDups(S));
    }

    private static String removeDups(String S) {
        String ans = "";
        for (int i = 0; i < S.length(); i++) {
            if (ans.indexOf(S.charAt(i))<0){
                ans = ans + S.charAt(i);
            }
        }
        return ans;
    }
}
