package com.String;
// https://practice.geeksforgeeks.org/problems/print-first-letter-of-every-word-in-the-string3632/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&difficulty[]=-1&page=1&query=category[]StringsproblemStatusunsolveddifficulty[]-1page1category[]Strings
// Print first letter of every word in the string

public class Print_first_Letter_of_every_word {
    public static void main(String[] args) {
        String S = "geeks for geeks";
        System.out.println(firstAlphabet(S));
    }
    static String firstAlphabet(String S) {
        StringBuilder sb = new StringBuilder();
        char[] ch = S.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i == 0 || ch[i-1] == ' '){
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}
