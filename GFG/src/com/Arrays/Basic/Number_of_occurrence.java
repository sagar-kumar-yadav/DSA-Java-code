package com.Arrays.Basic;

public class Number_of_occurrence {
    public static void main(String[] args) {
        int Arr[] = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(count(Arr, 7, 2));
    }
    static int count(int[] arr, int n, int x) {
        int first = findFirstOccurrence(arr, n, x);
        int last = findLastOccurrence(arr, n, x);
        int ans = 0;

        if (first == -1) {
            return 0;
        }
        else {
            ans = last - first + 1;
        }
        return ans;
    }

    static int findFirstOccurrence(int[] arr, int n, int x) {
        int start = 0;
        int end = n -1;
        int first = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                first = mid;
                end = mid - 1;
            }
            else if (arr[mid] > x) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return first;
    }

    static int findLastOccurrence(int[] arr, int n, int x) {
        int start = 0;
        int end = n -1;
        int last = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                last = mid;
                start = mid + 1;
            }
            else if (arr[mid] > x) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return last;
    }
}
