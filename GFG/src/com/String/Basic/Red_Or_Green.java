package com.String.Basic;
// https://practice.geeksforgeeks.org/problems/red-or-green5711/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&difficulty[]=-1&page=1&query=category[]StringsproblemStatusunsolveddifficulty[]-1page1category[]Strings
// Red OR Green

public class Red_Or_Green {
    public static void main(String[] args) {
        int N = 5;
        String S = "RGRGR";
        System.out.println(RedOrGreen(N, S));
    }
    static int RedOrGreen(int N, String S){
        int ans = 0;
        int rCount = 0, gCount = 0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'R'){
                rCount++;
            }
            else if (S.charAt(i) == 'G'){
                gCount++;
            }
            if (rCount > gCount){
                ans = gCount;
            }
            else {
                ans = rCount;
            }
        }
        return ans;
    }
}
