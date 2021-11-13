package com.sagar;

// https://code4coding.com/addition-of-two-numbers-in-java-using-method/
// Addition Of Two Numbers In Java Using Method

import java.util.Scanner;

public class Addition_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Add(a, b);

    }
    static void Add(int a, int b){
        int sum = a + b;
        System.out.println("Sum of Two Numbers "+ sum);
    }
}