package com.company;

// https://www.codechef.com/EXUN21C/problems/GRIDXOR

import java.util.Scanner;

public class Sarthak_and_his_Magic_Grid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0){
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("1"+" ");
                }
                System.out.println();
            }
        }
    }
}
