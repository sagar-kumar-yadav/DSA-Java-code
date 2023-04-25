package com.Arrays.Easy;

public class Search_insert_position_of_K_in_a_sorted_array {
    public static void main(String[] args) {
        int n = 4;
        int[] Arr = {1, 3, 5, 6};
        int k = 2;
        System.out.println(searchInsertK(Arr, n, k));
    }
    static int searchInsertK(int Arr[], int N, int k) {
        for (int i = 0; i < N-1; i++) {
            if (Arr[i] == k) {
                return i;
            }
            else if (Arr[i] > k) {
                return i;
            }
        }
        return N;
    }
}
