package com.sagar;

public class Q2 {
    public static void main(String[] args) {
        System.out.println((extraordinaryAdd(5)));
    }

    public static int specialAdd(int num1) {
        if (num1 != 0)
            return (num1 + 2) + specialAdd(num1 - 1);
        else {
            return 3;
        }
    }

    public static int extraordinaryAdd(int num2) {
        if (num2 != 0)
            return specialAdd(num2) + extraordinaryAdd(num2 - 1);
        else {
            return 0;
        }
    }
}
