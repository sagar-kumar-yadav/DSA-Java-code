package com.company;

// https://www.codechef.com/JAN222C/problems/MINFD

import java.util.Arrays;
import java.util.Scanner;

public class Chef_and_Fixed_Deposits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            calculate(x, arr);
        }
    }

    private static void calculate(int x, int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        boolean flag = true;
        if (sum < x) {
            System.out.println("-1");
            flag = false;
        }

        int min = 0;
        int count = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            min += arr[i];
            count++;
            if (min >= x) {
                break;
            }
        }
        if (flag){
            System.out.println(count);
        }
    }
}
