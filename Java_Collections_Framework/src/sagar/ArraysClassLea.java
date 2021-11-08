package sagar;

import java.util.Arrays;

public class ArraysClassLea {
    public static void main(String[] args) {
/*
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int index = Arrays.binarySearch(numbers, 4);

        System.out.println(index);*/

        int[] numbers = {10,3,4,5,2,31,234,42};
        Arrays.sort(numbers);

        Arrays.fill(numbers, 12);

        for (int i: numbers) {
            System.out.print(i+" ");
        }
    }
}