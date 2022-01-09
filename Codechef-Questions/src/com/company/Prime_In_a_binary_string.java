package com.company;

// https://www.codechef.com/JAN221C/problems/PINBS

import java.util.ArrayList;
import java.util.Scanner;

public class Prime_In_a_binary_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            String s = sc.next();
            sub(s);
        }
    }

    private static void sub(String s) {
        boolean flag = false;
        if (s.contains("10") || s.contains("11")) {
            flag = true;
        }
        if (flag) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
