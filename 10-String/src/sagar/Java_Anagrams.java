package sagar;

import java.util.Locale;
import java.util.Scanner;

public class Java_Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        /*
        // brute
        boolean isAnagram = false;
        boolean[] visited = new boolean[str2.length()];

        if (str1.length() == str2.length()){
            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);
                isAnagram = false;
                for (int j = 0; j < str2.length(); j++) {
                    if (str2.charAt(j) == ch && !visited[j]){
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
        */


        // better
        boolean isAnagram = true;

        int s1l[] = new int[256];
        int s2l[] = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int index = ch;
            s1l[index]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch = str1.charAt(i);
            int index = ch;
            s2l[index]++;
        }
        for (int i = 0; i < 256; i++) {
            if (s1l[i] != s2l[i]){
                isAnagram = false;
                break;
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
