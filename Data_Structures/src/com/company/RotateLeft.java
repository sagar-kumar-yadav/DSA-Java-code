package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class RotateLeft {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int d = sc.nextInt();
        int x = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < x; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println(rotateLeft(d, arr));
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        reverse(arr, 0, arr.size()-1);

        reverse(arr, 0, d-1);

        reverse(arr, d, arr.size()-1);

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

