//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sagar;

import java.util.Arrays;

public class Swap {
    public Swap() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 23, 9, 18, 56};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;

        for(int end = arr.length - 1; start < end; --end) {
            swap(arr, start, end);
            ++start;
        }

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
