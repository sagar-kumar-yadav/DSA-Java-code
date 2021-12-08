package com.company.String;

// Reversing the vowels
// https://practice.geeksforgeeks.org/problems/reversing-the-vowels5304/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&difficulty[]=-2&page=1&query=category[]StringsproblemStatusunsolveddifficulty[]-2page1category[]Strings

public class Reversing_The_Vowels {
    public static void main(String[] args) {
        String S = "practice";
        System.out.println(modify(S));
    }

    private static String modify(String s) {

        String vowels = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                vowels += s.charAt(i);
            }
        }

        String ans = "";
        int index = vowels.length()-1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                ans += vowels.charAt(index);
                index--;
            }
            else {
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}
