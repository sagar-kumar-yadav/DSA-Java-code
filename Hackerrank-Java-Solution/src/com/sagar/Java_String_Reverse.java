package com.sagar;

import java.util.Scanner;

public class Java_String_Reverse {
    public static void main(String[] args) {
    /*
        // using String builder
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String R = new StringBuilder(A).reverse().toString();

        if (A.equals(R)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        */

        // using char
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String rev = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
