package sagar;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Q.  Peak Index in a Mountain Array

public class Peak_Index_Mountain {
    public static void main(String[] args) {
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndexMountainArray(arr));
    }

    static int peakIndexMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + (end - start)/2;

            if (arr[mid]>arr[mid+1]){
                //you are in descending part of array
                // this may the answer but look at left
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
}
