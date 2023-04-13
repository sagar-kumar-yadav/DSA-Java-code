package com.sagar;

import java.util.Scanner;

class GfG
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPat(n);

    }
    static void printPat(int n)
    {
         // Your code here
         for (int i=1; i<=n; i++) {
             for (int j=1; j<=n*n; j++) {
                 while (n != 1) {
                     System.out.println();
                 }
             }
         }
    }
}