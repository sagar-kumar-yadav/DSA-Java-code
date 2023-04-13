package com.sagar.pattern;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inverted_half_pyramid_with_numbers ihpwn = new inverted_half_pyramid_with_numbers();
//        ihpwn.pattern1(n);

//        ihpwn.patternset1(n);

//        System.out.println(ihpwn.getTable(n));

        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int N = sc.nextInt();
        System.out.println(ihpwn.nthTermOfAP(A1, A2, N));
    }
}
