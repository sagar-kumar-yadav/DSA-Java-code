package com.Arrays.Basic;

import java.util.Arrays;

public class Ceil_The_Floor {

    public class Pair{
        int floor, ceil;

        Pair() {
            this.floor = 0;
            this.ceil = 0;
        }

        Pair(int floor, int ceil) {
            this.floor = floor;
            this.ceil = ceil;
        }
    }

    Pair getFloorAndCeil(int[] arr, int n, int x) {
        int floor = -1;
        int celing = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > floor && arr[i] <= x) {
                floor = arr[i];
            }
            if (arr[i] < celing && arr[i] >= x) {
                celing = arr[i];
            }
        }
        if (celing == Integer.MAX_VALUE) {
            celing = -1;
        }
        return new Pair(floor, celing);
    }

    public static void main(String[] args) {
        int Arr[] = {5, 6, 8, 9, 6, 5, 5, 6};
        Pair ans = new Ceil_The_Floor().getFloorAndCeil(Arr, 8, 7);
        System.out.println(ans.floor+" "+ans.ceil);
    }
}
