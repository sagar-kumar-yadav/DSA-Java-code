package com.sagar;

import java.util.Scanner;

public class day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        palindrome(str);
    }

    private static void palindrome(String str) {
        boolean ans = false;
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if (start == end){
                ans = true;
            }
            else {
                ans = false;
            }
        }
        if (ans){
            System.out.println("The word, "+str+", is a palindrome.");
        }
        else {
            System.out.println("The word, "+str+", is not a palindrome.");
        }
    }
}
