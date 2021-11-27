package com.sagar;

import java.util.Scanner;

public class Java_Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        // brute force
        boolean isAnagram = false;
        boolean[] visited = new boolean[str2.length()];

        if (str1.length() == str2.length()){
            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.toLowerCase().charAt(i);
                str2 = str2.toLowerCase();
                isAnagram = false;
                for (int j = 0; j < str2.length(); j++) {
                    if (str2.charAt(j) == ch && !visited[j] ){
                        visited[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if (!isAnagram){
                    break;
                }
            }
        }
        if (isAnagram){
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not Anagrams");
        }
    }
}
