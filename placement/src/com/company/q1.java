package com.company;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        String s = "abcdefghijklmnop16";
        findnext(s);
    }
    static void findnext(String s){
        int len = s.length();

        int num = 0;
        int x = 1;
        int i = len-1;
        for (i = len-1; i >= 0; i--) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                num = (s.charAt(i) - '0' ) * x + num;
                x = x * 10;
                if (num < len) {
                    System.out.println(num - len);
                }else {
                    break;
                }
            }else if (num == len) {
                System.out.println(-1);
            }
        }
    }
}
