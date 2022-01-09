package com.company;

// https://www.codechef.com/JAN221C/problems/RIFFLES

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Chef_and_Riffles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            calculate(n, k);
        }
    }

    private static void calculate(int n, int k) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr1.add(i);
        }
        swap(arr1, k);
//        for (int j = 0; j < arr1.size(); j++) {
//
//        }
    }

    private static void swap(ArrayList<Integer> arr1, int k) {
        if (k < 0){
            return;
        }

        for (int i = 0; i < arr1.size(); i++) {
            swap(arr1, k );
        }
    }
}
