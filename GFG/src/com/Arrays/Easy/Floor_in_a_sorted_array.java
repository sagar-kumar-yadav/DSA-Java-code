package com.Arrays.Easy;

public class Floor_in_a_sorted_array {
    public static void main(String[] args) {
        long arr[] = {1,2,8,10,11,12,19};
//        long[] arr = {35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113};
//        System.out.println(findFloor(arr, 79, 38));
        System.out.println(findFloor1(arr, 7, 5));
    }

    static int findFloor(long arr[], int n, long x) {
        if (arr[0] > x) {
            return -1;
        }
        if (arr[n - 1] <= x) {
            return n - 1;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > x) {
                return i - 1;
            }
        }
        return -1;
    }

    static int findFloor1(long[] arr, int n, int x) {
        int start = 0;
        int end = n-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > x) {
                end = mid - 1;
            }
            else if (arr[mid] < x) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
