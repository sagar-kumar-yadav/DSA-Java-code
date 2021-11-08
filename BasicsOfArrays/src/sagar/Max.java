//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sagar;

public class Max {
    public Max() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 9, 18};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        } else {
            int maxVal = arr[0];

            for(int i = 1; i < arr.length; ++i) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                }
            }

            return maxVal;
        }
    }
}
