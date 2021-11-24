package com.sagar;

import java.util.*;

import static java.lang.Integer.parseInt;

public class Int_to_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= -100 && n <= 100){
            convert(n);
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer.");
        }
    }


    static void convert(int n){
        String s = Integer.toString(n);
    }
}
