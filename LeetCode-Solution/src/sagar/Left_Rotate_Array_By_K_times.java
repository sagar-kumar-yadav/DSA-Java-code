package sagar;

public class Left_Rotate_Array_By_K_times {
    public static void main(String[] args) {
        long[] arr= {1,2,3,4,5,6,7};
        int n = 7;
        int k = 3;
//        leftRotate(arr, n, k);
        leftRotate1(arr, n, k);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    static void leftRotate(long arr[], int n, int k) {
        if (n == 0) {
            return;
        }

        k = k % n;

        int[] temp = new int[k];

        // step:-1 copying first k element in temp array
        for (int i = 0; i < k; i++) {
            temp[i] = (int) arr[i];
        }

        // step:-2 shift last n-k elements
        for (int i = k; i < n; i++) {
            arr[i-k] = arr[i];
        }

        // step:-3 Place the element of the temporary
        for (int i = n-k; i < n; i++) {
            arr[i] = temp[i - (n-k)];
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static void leftRotate1(long[] arr, int n, int k) {
        k = k % n;

        // step:-1 reverse first k element
        reverse(arr, 0, k-1);

        // step:-2 reverse last element after k
        reverse(arr, k, n-1);

        // step:-3 reverse array
        reverse(arr, 0, n-1);
    }
    static void reverse(long[] arr, int start, int end) {
        while (start <= end) {
            long temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
