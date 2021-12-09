package com.Must_Do_Coding_Questions;

// Missing number in array
//  https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1

public class Missing_Number_In_Array {
    public static void main(String[] args) {
        int n = 2;
        int[] array = {1};
        System.out.println(MissingNumber(array, n));
    }

    private static int MissingNumber(int[] array, int n) {

        // method - 1
/*

        // sum of natural number(Sn) = n(n+1)/2;
        int Sn = n * (n+1)/2;

        // sum of all array
        int Sa = 0;
        for (int i = 0; i < array.length; i++) {
            Sa += array[i];
        }

        //  sum of natural number - sum of all array
        int ans = Sn - Sa;
        return ans;
*/

        // method - 2  XOR method

/*
        int xor = 0;
        for (int i = 0; i < array.length; i++) {
            xor = xor ^ array[i];
        }
        for (int i = 1; i <= n; i++) {
            xor = xor ^ i;
        }
        return xor;
 */

        // method - 3 Cyclic Sort
        int i = 0;
        while (i < array.length){
            int correct = array[i] - 1;
            if (array[i] != array[correct]){
                swap(array, i, correct);
            }
            else {
                i++;
            }
        }

       // search for first missing number
        for (int index = 0; index < array.length; index++){
            if (array[index] != index+1){
                return index+1;
            }
        }
        return n;
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
