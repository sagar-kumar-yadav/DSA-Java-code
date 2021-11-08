//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sagar;

import java.util.Arrays;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 23, 3, 4, 65, 34};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr) {
        arr[0] = 99;
        arr[4] = 190;
    }
}
