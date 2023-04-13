package com.Arrays;

// https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1/?category[]=Arrays&category[]=Java&category[]=Arrays&category[]=Java&problemStatus=unsolved&difficulty[]=-1&page=1&query=category[]Arrayscategory[]JavaproblemStatusunsolveddifficulty[]-1page1category[]Arrayscategory[]Java#
// Number of occurrence

public class Number_Of_Occur {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {8, 9, 10, 12, 12, 12};
        int x = 12;
        System.out.println(count(arr, n, x));
    }
    static int count(int[] arr, int n, int x) {
        int firstIndex = findFirstOccurrences(arr, n, x);
        int lastIndex =  findLastOccurrence(arr, n, x);
        int ans = 0;
        if (firstIndex == -1){
            return 0;
        }
        else {
            ans = lastIndex - firstIndex + 1;
        }
        return ans;
    }
    static int findFirstOccurrences(int[] arr, int n, int x){
        int start = 0;
        int end = n - 1;
        int FirstOcc = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == x){
                FirstOcc = mid;
                end = mid - 1;
            }
            else if (arr[mid] > x){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return FirstOcc;
    }
    static int findLastOccurrence(int[] arr, int n, int x) {
        int start = 0;
        int end = n - 1;
        int lastOcc = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                lastOcc = mid;
                start = mid + 1;
            } else if (x < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return lastOcc;
    }
}
