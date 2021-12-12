package com.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Unique_Numbers {
    public static void main(String[] args) {
        int L = 10;
        int R = 20;
        System.out.println(uniqueNumbers(L, R));
    }
    static ArrayList<Integer> uniqueNumbers(int L, int R){

        // create an array list
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = L; i <= R; i++) {

            // convert no of string
            String s = String.valueOf(i);

            // crate a hashset
            HashSet<Integer> hs = new HashSet<Integer>();

            // convert string in character array
            char[] ch = s.toCharArray();

            // traverse individual character
            for (int j = 0; j < ch.length; j++) {

                // convert in integer and add in set
                hs.add((int) ch[j]);
            }

            // if string length and set length is equal add in array list
            if (s.length() == hs.size()){
                ans.add(i);
            }
        }
        return ans;
    }
}
