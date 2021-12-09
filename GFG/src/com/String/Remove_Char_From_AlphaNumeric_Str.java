package com.String;
// https://practice.geeksforgeeks.org/problems/remove-characters-from-alphanumeric-string0648/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&difficulty[]=-2&page=1&query=category[]StringsproblemStatusunsolveddifficulty[]-2page1category[]Strings
// Remove characters from alphanumeric string

public class Remove_Char_From_AlphaNumeric_Str {
    public static void main(String[] args) {
        String S = "AA1d23cBB4";
        System.out.println(removeCharacters(S));
    }
    static String removeCharacters(String S){
        String ans = "";
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) >= 47 && S.charAt(i) <= 57){
                ans = ans + S.charAt(i);
            }
        }
        return ans;
    }
}
