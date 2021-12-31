package com.String.School;
// https://practice.geeksforgeeks.org/problems/display-longest-name0853/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&difficulty[]=-2&page=1&query=category[]StringsproblemStatusunsolveddifficulty[]-2page1category[]Strings
// Display longest name

public class Display_Longest_Name {
    public static void main(String[] args) {
        int N = 5;
        String[] names = {"Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"};
        System.out.println(longest(names, N));
    }
    static String longest(String names[], int n){
        int count = 0, ans = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > count){
                count = names[i].length();
                ans = i;
            }
        }
        return names[ans];
/*
        String ans = names[0];
        for (int i = 0; i < n; i++) {
            if (names[i].length() > ans.length()){
                ans = names[i];
            }
        }
        return ans;
        */
    }
}
