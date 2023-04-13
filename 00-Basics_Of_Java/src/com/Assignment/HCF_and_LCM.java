package com.Assignment;

// Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class HCF_and_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter first number here: ");      // 15
        int num1 = in.nextInt();
        System.out.print("enter second number here: ");     // 65
        int num2 = in.nextInt();

        int n1 = num1;
        int n2 = num2;

        // divide n1 to n2 whenever remainder is not zero
        while(num1 % num2 != 0){
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        int HCF = num2;

        // lcm = (num1 * num2) / HCF
        int LCM = (n1 * n2)/HCF;

        System.out.println(" HCF is " +HCF+ " of first number " +num1+ " and second number " +num2);
        System.out.println(" LCM is " +LCM+ " of first number " +num1+ " and second number " +num2);
    }
}
