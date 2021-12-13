package com.assignment;

// https://leetcode.com/problems/flipping-an-image/
// 832. Flipping an Image

import java.util.Arrays;

public class Flipping_An_Image {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image.length];

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                ans[i][j] = image[i][image.length-1-j];

                if (ans[i][j] == 0){
                    ans[i][j] = 1;
                }
                else if (ans[i][j] == 1){
                    ans[i][j] = 0;
                }
            }
        }
        return ans;
    }
}
