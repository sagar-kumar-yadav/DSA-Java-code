//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sagar;

public class TwoD {
    public TwoD() {
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};

        for(int row = 0; row < arr.length; ++row) {
            for(int col = 0; col < arr[row].length; ++col) {
                System.out.print(arr[row][col] + " ");
            }

            System.out.println();
        }

    }
}
