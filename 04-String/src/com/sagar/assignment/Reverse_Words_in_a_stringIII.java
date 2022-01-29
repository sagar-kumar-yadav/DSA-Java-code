package com.sagar.assignment;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Reverse_Words_in_a_stringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    // method -1
    public static String reverseWords(String s) {
        int start = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i == ch.length-1){             // last words swap condition
                swap(start, i, ch);
            }
            if (ch[i] == ' ') {
                swap(start, i-1, ch);
                start = i + 1;
            }
        }
        return String.valueOf(ch);
    }

    private static void swap(int start, int currEnd, char[] ch) {
        while(start <= currEnd) {
            char temp = ch[start];
            ch[start] = ch[currEnd];
            ch[currEnd] = temp;
            start++;
            currEnd--;
        }
    }

}