package com.company;

import java.util.Scanner;

public class Binary_Number_To_Decimal_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String B = sc.next();
        System.out.println(binary_to_decimal(B));
    }
    public static int binary_to_decimal(String str) {
        int decValue = 0;

        int base = 1;
        for (int i = str.length() - 1; i >= 0 ; i--) {
            if (str.charAt(i) == '1') {
                decValue += base;
            }
            base = base * 2;
        }

        return decValue;
    }
}
