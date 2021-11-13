package com.sagar;

public class DigitProduct {
    public static void main(String[] args) {
        int n = 55;    // output 25
//        int n = 505;  // output 0
        System.out.println(product(n));
    }
    static int product(int n){
        if (n%10 == n){
            return n;
        }
        return (n % 10) * product(n/10);
    }
}
