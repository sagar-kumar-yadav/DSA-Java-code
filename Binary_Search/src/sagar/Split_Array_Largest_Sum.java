package sagar;

public class Split_Array_Largest_Sum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(arr, m));
    }

    private static int splitArray(int[] arr, int m) {
        int max = 0;        // largest sum in array
        int sum = 0;        // sum of arrays

        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            max = Math.max(max, arr[i]);
        }

        int start = max;
        int end = sum;
        int ans = 0;

        while (start <= end){
            int mid = start + (end - start)/ 2;

            if (isPossible(arr, mid, m) == true){
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[] arr, int mid, int m){
        int sa = 1;         // minimum sub array
        int sum = 0;

        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i];

            if (sum > mid){
                sa++;
                sum=arr[i];
            }
        }
        return sa <= m;
    }
}
