package com.String;

// https://practice.geeksforgeeks.org/problems/java-delete-alternate-characters4036/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&difficulty[]=-2&page=1&query=category[]StringsproblemStatusunsolveddifficulty[]-2page1category[]Strings
// Delete alternate characters

public class Delete_Alternate_Char {
    public static void main(String[] args) {
        String S = "Geeks";
        System.out.println(delAlternate(S));
    }

    private static String delAlternate(String S) {
        String ans = "";

        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0){
                ans = ans + S.charAt(i);
            }
        }
        return ans;
    }
}
