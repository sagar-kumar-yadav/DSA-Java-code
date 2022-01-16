package com.sagar.assignment;

// https://www.geeksforgeeks.org/remove-consecutive-duplicates-string/
// Remove all consecutive duplicates from the string

import java.util.Arrays;
import java.util.Scanner;

public class Remove_all_consecutive_duplicates_from_the_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        removeDuplicate(str);
        System.out.println(removeDuplicates(str));
    }

    // iterative
    private static void removeDuplicate(String str) {
        char[] ch = str.toCharArray();

        if (ch.length < 2) {
            return;
        }

        int j = 0;
        for (int i = 1; i < ch.length; i++) {
            if (ch[j] != ch[i]) {
                j++;
                ch[j] = ch[i];
            }
        }
        System.out.println(Arrays.copyOfRange(ch, 0, j + 1));
    }

    // recursive
    public static String removeDuplicates(String str){
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return removeDuplicates(str.substring(1));
        }
        else {
            return str.charAt(0) + removeDuplicates(str.substring(1));
        }
    }
}
