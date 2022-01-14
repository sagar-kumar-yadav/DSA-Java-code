package com.company;

// https://www.codechef.com/EXUN21C/problems/SUMPARITY

import java.util.Scanner;

public class Vedant_and_his_Hidden_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();

            if (n == 1) {
                if (a % 2 == 0) {
                    System.out.println("Even");
                }
                else {
                    System.out.println("Odd");
                }
            }
            else if (a % 2 == 1){
                if (n % 2 == 0) {
                    System.out.println("Even");
                }
                else {
                    System.out.println("Odd");
                }
            }
            else {
                System.out.println("Impossible");
            }
        }
    }
}
