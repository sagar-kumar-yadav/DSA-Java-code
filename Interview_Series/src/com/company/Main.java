package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        interviewQuestions iq = new interviewQuestions();

        // Q.1 https://practice.geeksforgeeks.org/contest/interview-series-google/problems/#
        /*String A = sc.next();
        String B = sc.next();
        System.out.println(iq.minRepeats(A, B));*/

        // Q.2 https://practice.geeksforgeeks.org/problems/peak-element/1
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[n] = sc.nextInt();
        }
        iq.peakElement(n, arr);
        System.out.println();
    }
}
