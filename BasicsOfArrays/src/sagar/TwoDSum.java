//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sagar;

import java.util.Scanner;

public class TwoDSum {
    public TwoDSum() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];

        int sum;
        int row;
        for(sum = 0; sum < arr.length; ++sum) {
            for(row = 0; row < arr[sum].length; ++row) {
                arr[sum][row] = sc.nextInt();
            }
        }

        sum = 0;

        for(row = 0; row < arr.length; ++row) {
            for(int col = 0; col < arr[row].length; ++col) {
                sum += arr[row][col];
            }
        }

        System.out.println(sum);
    }
}
