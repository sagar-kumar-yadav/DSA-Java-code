package com.sagar;

// print numbers 5, 4, 3, 2, 1, 1, 2, 3, 4, 5,

public class PrintNumbers {
    public static void main(String[] args) {
        printReverse(5);
    }
    static void printReverse(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printReverse(n - 1);
        print(n);
    }
    static void print(int n){
        if (n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
    }
}
