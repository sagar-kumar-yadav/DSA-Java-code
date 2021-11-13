package sagar;

// https://www.geeksforgeeks.org/count-number-of-occurrences-or-frequency-in-a-sorted-array/
// Q. Count number of occurrences (or frequency) in a sorted array
public class Count_Number_Of_Occurrences {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);

        int count = (last - first + 1);
        System.out.println(count);
    }
    static int findFirstOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int firstOccurrence = -1;           // if element is not found return -1

        while (start <= end){
            int mid = start + (end - start)/2;

            // check if element is found return lastOccurrence and Search in left array
            if (arr[mid] == target){
                firstOccurrence = mid;
                end = mid - 1;
            }
            else if (target < arr[mid]){
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        return firstOccurrence;
    }
    static int findLastOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int lastOccurrence = -1;         // if element is not found return -1

        while (start <= end){
            int mid = start + (end - start)/2;

            // check if element is found return lastOccurrence and Search in right array
            if (arr[mid] == target){
                lastOccurrence = mid;
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return lastOccurrence;
    }
}
