package com.company;

// https://practice.geeksforgeeks.org/problems/game-with-nos3123/1/?category[]=Arrays&category[]=Arrays&problemStatus=unsolved&difficulty[]=-1&page=1&query=category[]ArraysproblemStatusunsolveddifficulty[]-1page1category[]Arrays
// Game with nos

import java.util.Arrays;

public class Game_with_nos {
    public static void main(String[] args){
        int n = 5;
        int[] arr = {10, 11, 1, 2, 3};
        System.out.println(Arrays.toString(game_with_number(arr, n)));
    }
    public static int[] game_with_number (int arr[], int n) {
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i] ^ arr[i+1];
        }
        return arr;
    }
}
