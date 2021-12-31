package com.String.Basic;

// https://practice.geeksforgeeks.org/problems/keypad-typing0119/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&difficulty[]=-1&page=1&query=category[]StringsproblemStatusunsolveddifficulty[]-1page1category[]Strings
// Keypad typing

public class Keypad_typing {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(printNumber(s, s.length()));
    }

    private static String printNumber(String s, int n) {
        String ans = "";
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'c'){
                ans += "2";
            }
            if (s.charAt(i) >= 'd' && s.charAt(i) <= 'f'){
                ans += "3";
            }
            if (s.charAt(i) >= 'g' && s.charAt(i) <= 'i'){
                ans += "4";
            }
            if (s.charAt(i) >= 'j' && s.charAt(i) <= 'l'){
                ans += "5";
            }
            if (s.charAt(i) >= 'm' && s.charAt(i) <= 'o'){
                ans += "6";
            }
            if (s.charAt(i) >= 'p' && s.charAt(i) <= 's'){
                ans += "7";
            }
            if (s.charAt(i) >= 't' && s.charAt(i) <= 'v'){
                ans += "8";
            }
            if (s.charAt(i) >= 'w' && s.charAt(i) <= 'z'){
                ans += "9";
            }
        }
        return ans;
    }
}
