package com.sagar.assignment;

// https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
// Program for length of a string using recursion

public class Program_for_length_of_a_String {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(lengthStr(str));
    }

    private static int lengthStr(String str) {
        if (str.isEmpty()){
            return 0;
        }
        else {
            return lengthStr(str.substring(1))+1;
        }
    }
}
