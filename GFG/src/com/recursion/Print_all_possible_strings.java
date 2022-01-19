package com.recursion;

// https://practice.geeksforgeeks.org/problems/print-all-possible-strings/1/?category[]=Recursion&category[]=Recursion&problemStatus=unsolved&difficulty[]=-2&difficulty[]=-1&page=1&query=category[]RecursionproblemStatusunsolveddifficulty[]-2difficulty[]-1page1category[]Recursion
//
//import java.util.ArrayList;
//
//public class Print_all_possible_strings {
//    public static void main(String[] args) {
//        String str = "abc";
//        ArrayList<String> ans = spaceString(str);
//        System.out.println(ans);
//
//    }
//
//    static ArrayList<String> spaceString(String str) {
//        // Your code here
//        ArrayList<String> list = new ArrayList<>();
//
//        getAns(list, str, 0, "");
//        return list;
//    }
//
//    private static void getAns(ArrayList<String> list, String str, int i, String s) {
//        if (str.length() == i) {
//            list.add(s);
//            return;
//        }
//
//        getAns(list, str, i + 1, s + str.charAt(i));
////        if (i == 0) {
////            return;
////        }
//
//        getAns(list, str, i + 1, s + " " + str.charAt(i));
//
//    }
//}