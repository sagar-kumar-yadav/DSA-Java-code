package com.String;

// https://practice.geeksforgeeks.org/problems/java-reverse-a-string0416/1/?category[]=Strings&category[]=Strings&page=1&query=category[]Stringspage1category[]Strings
// Reverse a String

public class Reverse_A_String {
    public static void main(String[] args) {
        String s = "GeeksforGeeks";
        System.out.println(revStr(s));
    }

    private static String revStr(String S) {
        String ans = "";
        char ch;
        for (int i = S.length()-1; i >= 0; i--) {
            ch = S.charAt(i);
            ans = ans + ch;
        }
        return ans;
    }
}
