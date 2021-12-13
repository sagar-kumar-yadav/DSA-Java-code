package com.sagar.Basics;

// print reverse five numbers 5, 4, 3, 2, 1,

public class NumberReverse {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        // base condition
        if (n == 0){
            return;
        }
        System.out.println(n);

        // recursive call
        print(n-1);
    }
}
