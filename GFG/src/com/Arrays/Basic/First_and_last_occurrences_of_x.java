package com.Arrays.Basic;

import java.util.ArrayList;
import java.util.Scanner;

public class First_and_last_occurrences_of_x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int x = 5;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
//        System.out.println(find(arr, n , x));
//        System.out.println(find1(arr, n, x));
        System.out.println(find2(arr, n, x));
    }

    static ArrayList<Long> find(long arr[], int n, int x) {
        ArrayList<Long> arrayList = new ArrayList<>();
        ArrayList<Long> ans = new ArrayList<>();
        for (long i = 0; i < n; i++) {
            if (arr[(int) i] == x) {
                arrayList.add(i);
            }
        }
        ans.add(arrayList.get(0));
        ans.add(arrayList.get(arrayList.size()-1));

        return ans;
    }

    static ArrayList<Long> find1(long arr[], int n, int x) {
        ArrayList<Long> occurances = new ArrayList<>();
        long first = -1;
        long last = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x && first == -1) {
                first = i;
            }
            if (arr[i] == x) {
                last = i;
            }
        }
        occurances.add(first);
        occurances.add(last);
        return occurances;
    }

    static ArrayList<Long> find2(long[] arr, int n, int x) {
        long first = findFirstOccurrence(arr, n, x);
        long second = findLastOccurrence(arr, n, x);

        ArrayList<Long> result = new ArrayList<>();
        result.add(first);
        result.add(second);
        return result;
    }
    static int findFirstOccurrence(long[] arr, int n, int x) {
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

    static int findLastOccurrence(long[] arr, int n, int x) {
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
