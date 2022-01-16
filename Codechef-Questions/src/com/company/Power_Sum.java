package com.company;

// https://www.codechef.com/JAN222C/problems/POWSUM

import java.util.Scanner;

public class Power_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = 0;
            for (int i = 0; i < arr.length-1; i++) {
                ans+= arr[i];
            }
            if (ans == arr[arr.length]){
                System.out.println(ans);
            }
        }
    }
}
