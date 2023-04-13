package com.assignment;

import java.util.Arrays;

public class Check_If_The_Sentence_Is_Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydo";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence){
        if (sentence.length() < 26){
            return false;
        }
        for (char c = 'a'; c < 'z'; c++) {
            if (sentence.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }
}
