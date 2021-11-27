package com.sagar;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Pattern_Syntax_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());

        while (tc-- > 0){
            String pattern = sc.nextLine();

            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
    }
}
