package com.company;

import java.util.Scanner;

public class Richie_Rich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int ans = (b - a) / c;
            System.out.println(ans);
        }
    }
}
