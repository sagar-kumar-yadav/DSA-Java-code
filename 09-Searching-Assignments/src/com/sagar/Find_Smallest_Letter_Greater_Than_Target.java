package com.sagar;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// 744. Find The Smallest Letter Greater Than Target

public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'f';
        System.out.print(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        /*
        // brute force
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target){
                return letters[i];
            }
        }
        return letters[0];
        */

        // binary search
        int start = 0;
        int end = letters.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target){
                start++;
            }
            else {
                end--;
            }
        }
        if (start == letters.length){
            return letters[0];
        }
        return letters[start];
    }
}