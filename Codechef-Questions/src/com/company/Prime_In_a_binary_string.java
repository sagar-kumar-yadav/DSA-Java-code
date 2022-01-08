package com.company;

// https://www.codechef.com/JAN221C/problems/PINBS

import java.util.Scanner;

public class Prime_In_a_binary_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            String s = sc.next();
            sub("", s);
        }
    }

    private static void sub(String p, String up) {
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            sub(first + ch + second, up.substring(1));
        }
    }
}
