package com.Assignment;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        //Q. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

        Scanner in = new Scanner(System.in);
        System.out.print("input principal here: ");
        int p = in.nextInt();
        System.out.print("input time here: ");
        int t = in.nextInt();
        System.out.print("input rate here: ");
        int r = in.nextInt();


        float SI = (p * t * r)/100;
        System.out.print("simple interest is: "+ SI);
    }
}
