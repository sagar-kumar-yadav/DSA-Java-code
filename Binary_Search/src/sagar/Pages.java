package sagar;

//  https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
// Q. Allocate minimum number of pages
public class Pages {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int m = 2;
        System.out.println(minPages(arr, m));
    }

    static int minPages(int[] arr, int m) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            max = Math.max(max, arr[i]);
        }
        int low = max;
        int high = sum;
        int ans = 0;

        while (low < high){
            int mid = low + (high - low) / 2;

            if (isPossible(arr, mid, m) == true){
                ans = mid;
                high = mid - 1;     // load decrease
            }
            else {
                low = mid + 1;      // load increase
            }
        }
        return ans;
    }
    static boolean isPossible(int[] arr, int mid, int m){
        int st = 1;         // minimum student one
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (sum > mid){
                st++;
                sum = arr[i];
            }
        }
        return st <= m;
    }
}
