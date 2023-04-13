package com.company;

class Compute {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;
        rotate(arr, n);
    }
    
    public static void rotate(int arr[], int n)
    { 
        for (int i=0; i<arr.length; i++) {
            swap(arr, i, n-1);
            System.out.print(arr[i]+ " ");
        }
    }
    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}