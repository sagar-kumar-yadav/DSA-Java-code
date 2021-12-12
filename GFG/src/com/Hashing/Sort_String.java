package com.Hashing;

// Sort String
// https://practice.geeksforgeeks.org/problems/sort-string/0/?category[]=Hash&category[]=Hash&problemStatus=unsolved&difficulty[]=-2&difficulty[]=-1&page=1&query=category[]HashproblemStatusunsolveddifficulty[]-2difficulty[]-1page1category[]Hash


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Sort_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0){
            String s = sc.next();

            sortString(s);
        }
    }

    private static void sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.println(String.valueOf(arr));
    }
}
