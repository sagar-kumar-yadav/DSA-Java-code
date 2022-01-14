package com.company;

// https://www.codechef.com/JAN222C/problems/CRYCOLR

import java.util.Scanner;

public class Crying_Colours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {

            int x = sc.nextInt();
            int[] red = new int[3];
            int[] green = new int[3];
            int[] blue = new int[3];

            for (int i = 0; i < 3; i++) {
                red[i] = sc.nextInt();
                green[i] = sc.nextInt();
                blue[i] = sc.nextInt();
            }
        }
    }
}
