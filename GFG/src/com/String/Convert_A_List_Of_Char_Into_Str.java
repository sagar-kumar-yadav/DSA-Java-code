package com.String;
// https://practice.geeksforgeeks.org/problems/convert-a-list-of-characters-into-a-string5142/1/?problemStatus=unsolved&difficulty[]=-2&page=1&category[]=Strings&query=problemStatusunsolveddifficulty[]-2page1category[]Strings
// Convert a list of characters into a String

public class Convert_A_List_Of_Char_Into_Str {
    public static void main(String[] args) {
        int N = 4;
        char[] array = {'e', 'e', 'b', 'a'};
        System.out.println(chartostr(array, N));
    }
    public static String chartostr(char arr[], int N){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
