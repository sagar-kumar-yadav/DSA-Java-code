package sagar;

public class Left_Rotate_Array_By_One {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        int n = 7;
//        leftRotateArrayByOne(arr, n);
        leftRotateArrayByOne1(arr, n);
    }
    public static void leftRotateArrayByOne(int arr[],int n) {
        int temp[] = new int[n];
        for (int i = 1; i < n; i++) {
            temp[i - 1] =  arr[i];
        }
        temp[n - 1] = arr[0];
        for (int i = 0; i < n; i++) {
            System.out.println(temp[i]+" ");
        }
    }

    public static void leftRotateArrayByOne1(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n-1] = temp;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
