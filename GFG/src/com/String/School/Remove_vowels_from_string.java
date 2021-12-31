package com.String.School;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Remove_vowels_from_string {
    public static void main(String[] args) {
        String S = "welcome to geeksforgeeks";
        System.out.println(removeVowels(S));
//        System.out.println(removeVowels(S));
//        System.out.println(removeVowels1(S));
    }

    // method 1
    static String removeVowels(String S) {

        Character[] vowels = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};

        List<Character> list = Arrays.asList(vowels);

        StringBuilder sb = new StringBuilder(S);

        for (int i = 0; i < sb.length(); i++) {
            if (list.contains(sb.charAt(i))) {
                sb.replace(i, i+1, "");
                i--;
            }
        }
        return sb.toString();


    }

    // method - 2 throw tle
    static String removeVowel(String S) {
        // code here
        String ans = "";
        for (int i = 0; i < S.length(); i++) {
            if (!checkVowel(S.charAt(i))) {
                ans += S.charAt(i);
            }
        }
        return ans;
    }

    private static boolean checkVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }

    // method - 3
    static String removeVowels1(String S) {
        return S.replaceAll("[a,e,i,o,u,A,E,I,O,U]", "");
    }
}