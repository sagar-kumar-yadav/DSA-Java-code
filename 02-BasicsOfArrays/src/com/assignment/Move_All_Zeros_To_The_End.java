package com.assignment;

public class Move_All_Zeros_To_The_End {
    public static void main(String[] args) {
//        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int[] arr = {0,1,0,3,12};
//        pushZerosToEnd(arr, 5);
//        pushZerosToEnd1(arr, 5);
        pushZerosToEnd2(arr, 5);

    }
    static void pushZerosToEnd(int[] arr, int n) {
        // code here
        int temp[] = new int[n];
        int k=0;
        for (int i=0;i<n;i++){
            if (arr[i]!=0){
                temp[k]=arr[i];
                k++;
            }
        }

        while (k<n){
            temp[k]=0;
            k++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }

    static void pushZerosToEnd1(int[] arr, int n) {
        int k = 0;
        while (k < n) {
            if (arr[k] == 0) {
                break;
            }else {
                k = k +1;
            }
        }

        int i = k, j = k + 1;

        while (i < arr.length && j < arr.length) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;

            }

            j++;

        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void pushZerosToEnd2(int[] arr, int n) {
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
