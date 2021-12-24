package com.sagar;

import java.io.*;
import java.util.*;

public class day17 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0){
            int n = sc.nextInt();
            int p = sc.nextInt();
            calculate(n, p);
        }
    }

    private static void calculate(int n, int p){
        try {
            if (n < 0 || p < 0) {
                System.out.println("n and p should be non-negative");
            }
            else {
                int ans = (int) Math.pow(n, p);
                System.out.println(ans);
            }
        }
        catch (Exception e){

        }
    }
}