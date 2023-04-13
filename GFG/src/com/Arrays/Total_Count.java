package com.Arrays;

public class Total_Count {
    public static void main(String[] args){
        int n = 5;
        int k = 4;
        int[] arr = {10, 2, 3, 4, 7};
        System.out.println(totalCount(arr, n, k));
    }

    private static int totalCount(int[] arr, int n, int k) {

        int sum=0;
        for(int i=0; i<n; i++) {

            // if remainder is greater then 0
            if(arr[i] % k > 0) {
                sum=sum+(arr[i] / k) + 1;
            }
            else
                sum=sum+arr[i]/k;
        }
        return sum;
    }
}
