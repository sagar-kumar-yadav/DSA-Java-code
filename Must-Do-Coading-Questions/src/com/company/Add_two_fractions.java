package com.company;

import java.util.Scanner;

public class Add_two_fractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();
        addFraction(num1, den1, num2, den2);
    }
    static void addFraction(int num1, int den1, int num2, int den2) {
        if (den1 == 0) {
            System.out.println("0");
        }
        else if (den1 == den2) {
            System.out.println(num1+num2+"/"+den2);
        }
        else {
            int lcm = lcm(den1, den2);
            int x = (lcm/den1 * num1);
            int y = (lcm/den2 * num2);
            System.out.println(x + y +"/"+lcm);
        }
    }

    private static int lcm(int den1, int den2) {
        return (den1*den2)/hcf(den1, den2);
    }

    private static int hcf(int den1, int den2) {
        int min = Math.min(den1, den2);
        int hcf1 = 0;
        for (int i = 1; i <=min; i++) {
            if (den1%i==0 && den2%i==0) {
                hcf1 = i;
            }
        }
        return hcf1;
    }
}