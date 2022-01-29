package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RotateLeft1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int x = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < x; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println(rotateLeft1(d, arr));
    }

    public static List<Integer> rotateLeft1(int d, List<Integer> arr) {
        reverse(arr, 0, arr.size()-1);

        reverse(arr, 0, arr.size()-1-d);

        reverse(arr, arr.size()-d, arr.size()-1);

        return arr;
    }

    private static void reverse(List<Integer> arr, int start, int end) {
        while (start < end) {
            Collections.swap(arr, start, end);
            start++;
            end--;
        }
    }
}
