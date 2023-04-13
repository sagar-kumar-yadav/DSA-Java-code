package com.sagar.assignment;

import java.util.Scanner;

class LeetCode1768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String world1 = sc.nextLine();
        String world2 = sc.nextLine();
        System.out.println(mergeAlternately(world1, world2));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() ||  j < word2.length()) {
            if (i < word1.length()){
                sb.append(word1.charAt(i++));
            }
            if (j < word2.length()) {
                sb.append(word2.charAt(j++));
            }
        }
        return sb.toString();
    }
}