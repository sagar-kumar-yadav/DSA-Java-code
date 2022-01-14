package com.company;

// https://www.codechef.com/JAN222C/problems/EXAMTIME

import java.util.Scanner;

public class TCS_Examination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int b3 = sc.nextInt();

            int dragon = a1 + a2 + a3;
            int sloth = b1 + b2 + b3;

            if (dragon > sloth) {
                System.out.println("DRAGON");
            }
            else if (sloth > dragon) {
                System.out.println("SLOTH");
            }
            else if (dragon == sloth) {
                if (a1 > b1) {
                    System.out.println("DRAGON");
                }
                else if (a1 < b1){
                    System.out.println("SLOTH");
                }
                else if (a1 == b1){
                    if (a2 > b2) {
                        System.out.println("DRAGON");
                    }
                    else if (b2 > a2) {
                        System.out.println("SLOTH");
                    }
                    else {
                        System.out.println("TIE");
                    }
                }
            }
        }
    }
}
