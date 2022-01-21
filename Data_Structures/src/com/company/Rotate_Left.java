package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rotate_Left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(rotateLeft(d, arr));
    }
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        calculate(arr, d, list, ans);
        return ans;
    }

    private static void calculate(List<Integer> arr, int d, List<List<Integer>> list, List<Integer> ans) {
        if (d <= 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < arr.size(); i++) {
            calculate(arr, d - 1, );
        }

    }
}
