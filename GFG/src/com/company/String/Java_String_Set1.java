package com.company.String;
// https://practice.geeksforgeeks.org/problems/java-strings-set-15112/1/?category[]=Strings&category[]=Strings&difficulty[]=-2&page=1&query=category[]Stringsdifficulty[]-2page1category[]Strings
// Java Strings | Set 1

import java.util.Arrays;
import java.util.Scanner;

public class Java_String_Set1 {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0){
            String S1 = sc.next();
            String S2 = sc.next();
            System.out.println(conRevstr(S1, S2));
        }

    }
    static String conRevstr(String S1, String S2){
        String s = S1 + S2;

        String ans = "";
        char ch;
        for (int i = s.length()-1; i >= 0; i--) {
            ch = s.charAt(i);
            ans = ans + ch;
        }
        return ans;
    }
}
