package com.Hashing;

// Check if a string is Isogram or not
// https://practice.geeksforgeeks.org/problems/check-if-a-string-is-isogram-or-not-1587115620/1/?category[]=Hash&category[]=Hash&difficulty[]=-2&difficulty[]=-1&page=1&query=category[]Hashdifficulty[]-2difficulty[]-1page1category[]Hash

import java.util.HashSet;

public class Check_if_a_string_is_Isogram_or_not {
    public static void main(String[] args) {
        String s = "machine";
//        isIsogram(s);
        System.out.println(isIsogram(s));
    }
    static boolean isIsogram(String data){
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < data.length(); i++) {
            hs.add(data.charAt(i));
        }
        if (data.length() == hs.size()) {
            return true;
        }
        else {
            return false;
        }
    }
}
