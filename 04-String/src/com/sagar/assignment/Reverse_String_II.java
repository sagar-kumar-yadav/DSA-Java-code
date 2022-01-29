package com.sagar.assignment;

// https://leetcode.com/problems/reverse-string-ii/

public class Reverse_String_II {
    public static void main(String[] args) {
        String s = "abcde";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }
    public static String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i += 2 * k) {
            int end = i + k -1;
            int start = i;

            if (end < ch.length){
                swap(start, end, ch);
            }
            else {
                end = ch.length-1;
                swap(start, end, ch);
            }
        }
        return String.valueOf(ch);
    }

    private static void swap(int start, int end, char[] ch) {
        while(start <= end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }
}
