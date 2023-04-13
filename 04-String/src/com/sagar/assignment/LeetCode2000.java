package com.sagar.assignment;

import java.util.Scanner;

class LeetCode2000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(reversePrefix(word, ch));
    }
    public static String reversePrefix(String word, char ch) {
        char[] c = word.toCharArray();
        int locate = 0;
        for (int i = 0; i < word.length(); i++) {
            if (c[i] == ch) {       // first occurrence of ch
                locate = i;
                break;
            }
        }
        char[] ans = new char[word.length()];
        for (int i = 0; i <= locate; i++) {
            ans[i] = c[locate-i];
        }
        for (int i = locate + 1; i < word.length(); i++) {
            ans[i] = c[i];
        }
        return String.valueOf(ans);
    }

//    private static void reverPre(int start, int end, char[] w) {
//        while (start < end) {
//            char temp = w[end];
//            w[start] = w[start];
//            w[start] = temp;
//            end++;
//            start--;
//        }
//    }
}