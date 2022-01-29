package com.sagar.assignment;

// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/

class Decrypt_String {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int num = 0;
            if ((i + 2) < s.length() && s.charAt(i + 2) == '#') {
                num = Integer.valueOf(s.substring(i, (i+2)));         //get number with substring
                i += 2;
            }
            else {
                num = Character.getNumericValue(s.charAt(i));
            }
            sb.append((char) (num + 96));  //ASCI character 97 is character a - each time add number to find the lowercase character and cast to char
        }
        return sb.toString();
    }
}