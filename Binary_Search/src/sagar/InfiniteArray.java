package sagar;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// Q. Find position of an element in a sorted array of infinite numbers

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 5;
//        System.out.println(searchInfiniteArray(arr, target));
        System.out.println(ans(arr, target));

    }

    // brute force
/*    static int searchInfiniteArray(int[] arr, int target) {
        int start = 0;
        while (arr[start] <= target) {
            if (arr[start] == target) {
                return start;
            } else {
                start = start + 1;
            }
        }
        return -1;
    }*/

    // binary search
    static int ans(int[] arr, int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int newStart = end+1;  //  this is new start

            // double the box value
            // end = previous end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid= start + (end - start)/2;

            if (target < arr[mid]){
                end = mid -1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
