package com.sagar;

public class qqq {
    public static void main(String[] args) {
        int[] arr = {25, 10, 67, 34};
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        int noOfPasses = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swaped = false;
            noOfPasses += 1;
            for (int j = 0; j < arr.length - i - 1; j++) {
                swap(arr, i, j + 1);
                swaped = true;
            }
        }
        System.out.println(noOfPasses);
    }

    private static void swap(int[] arr, int first, int last) {
        int noOfSwaps = 0;
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
        noOfSwaps +=1;
//        System.out.println(noOfSwaps);
    }
}
