package com.sagar;

import java.util.Scanner;

public class Array_DS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        int[] arr = new int[tc];

        for (int i = 0; i < tc; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}