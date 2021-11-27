package com.sagar;

import java.util.Scanner;

public class Java_String_Tokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] token = s.split("[^a-zA-Z]");

        int countTokens = 0;
        for (int i = 0; i < token.length; i++) {
            if (token[i].length() > 0){
                countTokens++;
            }
        }
        System.out.println(countTokens);

        for (int i = 0; i < token.length; i++) {
            if (token[i].length() > 0){
                System.out.println(token[i]);
            }
        }
    }
}
