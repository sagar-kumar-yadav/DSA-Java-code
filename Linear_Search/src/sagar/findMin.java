package sagar;

public class findMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, 7, 3, 14, 28};
//        System.out.println(min(arr));
        System.out.println(min1(arr));
    }
    static int min(int[] arr){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    ans = arr[j];
                }
            }
        }
        return ans;
    }

    static int min1(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
